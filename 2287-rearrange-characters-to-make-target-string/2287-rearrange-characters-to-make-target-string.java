class Solution {
    public int rearrangeCharacters(String s, String target) {
        Map<Character,Integer> required = new HashMap<>();
        Map<Character,Integer> available = new HashMap<>();
        int count = Integer.MAX_VALUE;
        for(int i = 0 ; i < target.length() ; i++){
            required.put(target.charAt(i),required.getOrDefault(target.charAt(i),0)+1);
        }
        for(int i = 0 ; i < s.length() ; i++){
            available.put(s.charAt(i),available.getOrDefault(s.charAt(i),0)+1);
        }
        for(Map.Entry<Character,Integer> entry : required.entrySet()){
            Character key = entry.getKey();
            if(available.containsKey(key)){
                int n = available.get(key)/required.get(key);
                count = Math.min(count,n);
            }
            else{
                return 0;
            }
        }
        return count;
    }
}