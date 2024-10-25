class Solution {
    public int numberOfSubstrings(String s, int k) {
        // int count = 0;
        // Map<Character,Integer> map = new HashMap<>();
        // int left = 0 ;
        // for(int right = 0 ; right < s.length() ; right++)
        // {
        //     map.put(s.charAt(right),map.getOrDefault(s.charAt(right),0) + 1);
        //     while(map.values().stream().anyMatch(val -> val >= k))
        //     {
        //         count += s.length() - right;
        //         map.put(s.charAt(left),map.get(s.charAt(left)) - 1);
        //         left++;
        //     } 
        // }
        // return count;
        int count = 0;
        Map<Character,Integer> map = new HashMap<>();
        int left = 0;
        for(int right = 0 ; right < s.length() ; right++)
        {
            map.put(s.charAt(right),map.getOrDefault(s.charAt(right),0) + 1);
            while(map.values().stream().anyMatch(val -> val >= k))
            {
                count += s.length() - right;
                map.put(s.charAt(left),map.get(s.charAt(left)) - 1);
                left++;
            }
        }
        return count;
    }
}