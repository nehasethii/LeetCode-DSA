class Solution {
    public List<String> letterCombinations(String digits) {
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
        generateCombinations(digits,ans,"",map,0);
        return ans;
    }
    public void generateCombinations(String digits, List<String> ans, String temp,     
    Map<Character,String> map, int index){
        if(index == digits.length()){
            ans.add(temp);
            return;
        }
        String s = map.get(digits.charAt(index));
        for(int i = 0 ; i < s.length() ; i++){
            temp += s.charAt(i);
            generateCombinations(digits,ans,temp,map,index+1);
            temp = temp.substring(0,temp.length()-1);
        }
    }
}