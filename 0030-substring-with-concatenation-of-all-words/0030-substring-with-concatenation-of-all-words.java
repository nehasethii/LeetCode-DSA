class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        int skip = words[0].length();
        List<Integer> ans = new ArrayList<>();
        Map<String,Integer> need = new HashMap<>();
        Map<String,Integer> have = new HashMap<>();
        String str = "";
        int size = words.length * words[0].length();
        
        for(int i = 0 ; i < words.length ; i++){
            need.put(words[i],need.getOrDefault(words[i],0) + 1);
        }
        for(int i = 0 ; i < words[0].length() ; i++){
            int low = i;
            int high = i;
            have.clear();
            str = "";
            for(high = i ; high + skip <= s.length() ; high += skip){
                String temp = s.substring(high , high + skip);

                if(!need.containsKey(temp)){
                    have.clear();
                    str = "";
                    low = high + skip;
                    continue;
                }    

                str += temp;
                have.put(temp,have.getOrDefault(temp,0) + 1);

                while(have.getOrDefault(temp,0) > need.getOrDefault(temp,0)){
                    String t = s.substring(low , low + skip);
                    have.put(t,have.getOrDefault(t,0) - 1);
                    str = str.substring(skip,str.length());
                    low += skip;
                }

                if(str.length() == size){
                    ans.add(low);
                    temp = s.substring(low , low + skip);
                    have.put(temp,have.getOrDefault(temp,0) - 1);
                    low += skip;
                    str = s.substring(low,high + skip);
                }
            }
        }
        return ans;
    }
}