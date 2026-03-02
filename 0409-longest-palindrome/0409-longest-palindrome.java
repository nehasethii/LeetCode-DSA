class Solution {
    public int longestPalindrome(String s) {
        int length = 0;
        boolean oddCount = false;
        Map<Character,Integer> map = new HashMap<>();
        for(int i = 0 ; i < s.length() ; i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            if(entry.getValue() % 2 == 0){
                length += entry.getValue();
            }
            else{
                length += entry.getValue() - 1; 
                oddCount = true;
            }
        }
        return oddCount ? length + 1 : length;
    }
}