class Solution {
    public String minWindow(String s, String t) {
        Map<Character,Integer> map1 = new HashMap<>();
        Map<Character,Integer> map2 = new HashMap<>();
        int n = s.length();
        String str = "";
        int ans = Integer.MAX_VALUE;
        int low = 0 , high = 0;
        for(int i = 0 ; i < t.length() ; i++){
            map1.put(t.charAt(i),map1.getOrDefault(t.charAt(i),0) + 1);
        }
        for(high = 0 ; high < n ; high++){
            map2.put(s.charAt(high),map2.getOrDefault(s.charAt(high),0) + 1);
            while(containsSubstr(map1,map2)){
                int len = high - low + 1;
                if(len < ans){
                    ans = len;
                    str = s.substring(low,high+1);
                }

                map2.put(s.charAt(low),map2.get(s.charAt(low)) - 1);
                if(map2.get(s.charAt(low)) == 0){
                    map2.remove(s.charAt(low));
                }
                low++;
            }
        }
        return str;
    }

    public boolean containsSubstr(Map<Character,Integer> map1 , Map<Character,Integer> map2){
        for(Map.Entry<Character,Integer> entry : map1.entrySet()){
            if(!map2.containsKey(entry.getKey())){
                return false;
            }
            if(map2.get(entry.getKey()) < entry.getValue()){
                return false;
            }
        }
        return true;
    }
}