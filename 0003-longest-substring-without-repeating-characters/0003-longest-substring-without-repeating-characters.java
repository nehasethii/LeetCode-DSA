class Solution {
    public int lengthOfLongestSubstring(String s) {
        int ans = Integer.MIN_VALUE;
        Map<Character,Integer> map = new HashMap<>();
        int low = 0 , high = 0;
        int n = s.length();
        for(high = 0 ; high < n ; high++){
            map.put(s.charAt(high) , map.getOrDefault(s.charAt(high) ,0) + 1);
            int len = high - low + 1;
            while(map.size() < len){
                map.put(s.charAt(low) , map.getOrDefault(s.charAt(low) , 0) - 1);
                if(map.get(s.charAt(low)) == 0){
                    map.remove(s.charAt(low));
                }
                low++;
                len = high - low + 1;
            }
            ans = Math.max(ans,len);
        }
        return (ans == Integer.MIN_VALUE) ? 0 : ans;
    }
}