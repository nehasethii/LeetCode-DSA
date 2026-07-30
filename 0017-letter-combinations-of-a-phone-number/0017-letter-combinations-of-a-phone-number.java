class Solution {
    public List<String> letterCombinations(String digits) {
        StringBuilder s = new StringBuilder();
        List<String> ans = new ArrayList<>();
        Map<Character,String> map = new HashMap<>();
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");

        return combinations(digits,s,0,map,ans);
    }
    public List<String> combinations(String digits ,StringBuilder s , int idx ,Map<Character,String> map ,List<String> ans){
        if(idx == digits.length()){
            ans.add(s.toString());
            return ans;
        }
        String chars = map.get(digits.charAt(idx));
        for(int i = 0 ; i < chars.length() ; i++){
            s.append(chars.charAt(i));
            combinations(digits,s,idx+1,map,ans);
            s.deleteCharAt(s.length() - 1);
        }
        return ans;
    }
}