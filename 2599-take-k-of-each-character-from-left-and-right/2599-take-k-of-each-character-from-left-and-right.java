class Solution {
    public int takeCharacters(String s, int k) {
        if(k == 0)
            return 0;
        int n = s.length();
        int[] count = new int[3];
        for(int i = 0 ; i < n ; i++)
            count[s.charAt(i) - 'a']++;
        for(int i = 0 ; i < count.length ; i++)
        {
            if(count[i] < k)
                return -1;
        }
        int left = 0 , right = 0;
        int window = n;
        for(int i = 0; i < n ; i++)
        {
            left = i - 1;
            while(right < n && count[s.charAt(right) - 'a'] > k)
                count[s.charAt(right++) - 'a']--;
            window = Math.min(window,(left + 1) + (n - right));
            if(left < n-1)
                count[s.charAt(left + 1) - 'a']++;
            if(left >= right)
                break;
        }
        return window;
    }
}