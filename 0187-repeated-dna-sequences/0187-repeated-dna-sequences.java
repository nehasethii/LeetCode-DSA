class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        Map<String,Integer> map = new HashMap<>();
        List<String> ans = new ArrayList<>();
        if(s.length() < 10){
            return ans;
        }
        String str = "";
        for(int i = 0 ; i <= s.length() - 10 ; i++){
            str = s.substring(i , i + 10);
            map.put(str,map.getOrDefault(str,0) + 1);
            if(map.get(str) == 2){
                ans.add(str);
            }
        }
        return ans;
    }
}