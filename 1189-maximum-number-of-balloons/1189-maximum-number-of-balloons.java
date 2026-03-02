class Solution {
    public int maxNumberOfBalloons(String text) {
        Map<Character,Integer> required = new HashMap<>();
        Map<Character,Integer> available = new HashMap<>();
        required.put('b',1);
        required.put('a',1);
        required.put('l',2);
        required.put('o',2);
        required.put('n',1);
        int count = Integer.MAX_VALUE;
        for(int i = 0 ; i < text.length() ; i++){
            available.put(text.charAt(i),available.getOrDefault(text.charAt(i),0)+1);
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