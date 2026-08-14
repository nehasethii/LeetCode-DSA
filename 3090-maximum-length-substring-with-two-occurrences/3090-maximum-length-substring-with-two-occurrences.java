class Solution {
    public int maximumLengthSubstring(String s) {
        Map<Character,Integer> map = new HashMap<>();
        int low = 0; 
        int high = 0;
        int len = 0;
        for(high = 0 ; high < s.length() ; high++){
            char ch = s.charAt(high);
            map.put(ch, map.getOrDefault(ch,0)+1);
            while(map.get(ch) > 2){
                map.put(s.charAt(low),map.getOrDefault(s.charAt(low),0)-1);
                low++;
            }
            len = Math.max(len , (high - low + 1));
        }
        return len;
    }
}