class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        //Declarations
        List<Integer> ans = new ArrayList<>();
        Map<String,Integer> map1 = new HashMap<>(); //needed
        Map<String,Integer> map2 = new HashMap<>();  //available
        int n = s.length();
        int w = words.length;
        int wl = words[0].length();
        //int size = w * wl;
        int count = 0;

        //needed mapping
        for(int i = 0 ; i < w ; i++){
            map1.put(words[i] , map1.getOrDefault(words[i],0) + 1);
        }

        int low = 0 , high = 0;
        for(int start = 0 ; start < wl ; start++){//for offsets 0,3,6... 1,4,7... 2,5,8...
            map2.clear();
            count = 0;
            low = start;
            high = start;
            for( ; high + wl <= n ; high += wl){
                // include high
                String str = s.substring(high , high + wl);
                if(!map1.containsKey(str)){
                    map2.clear();
                    count = 0;
                    low = high + wl;
                    continue;
                }
                map2.put(str,map2.getOrDefault(str,0) + 1);
                count++;

                // while incorrect
                while(map2.get(str) > map1.get(str)){
                    String leftStr = s.substring(low, low + wl);
                    map2.put(leftStr,map2.get(leftStr) - 1);
                    if(map2.get(leftStr) == 0){
                        map2.remove(leftStr);
                    }
                    low += wl;
                    count--;
                }

                //if correct
                if(count == w){
                    ans.add(low);
                }
            }
        }
        return ans;
    }
}