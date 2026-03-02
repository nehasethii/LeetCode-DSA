class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character,Integer> required = new HashMap<>();
        Map<Character,Integer> available = new HashMap<>();
        for(int i = 0 ; i < ransomNote.length() ; i++){
            required.put(ransomNote.charAt(i),required.getOrDefault(ransomNote.charAt(i),0)+1);
        }
        for(int i = 0 ; i < magazine.length() ; i++){
            available.put(magazine.charAt(i),available.getOrDefault(magazine.charAt(i),0)+1);
        }
        for(Map.Entry<Character,Integer> entry : required.entrySet()){
            if(entry.getValue() > available.getOrDefault(entry.getKey(),0)){
                return false;
            }
        }
        return true;
    }
}