class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s2.length() < s1.length())
            return false;
        int[] countS1 = new int[26];
        int[] countS2 = new int[26];
        for(int i = 0 ; i < s1.length() ; i++)
        {
            countS1[s1.charAt(i) - 'a']++;
            countS2[s2.charAt(i) - 'a']++;
        }

        for(int i = 0 ; i < s2.length() - s1.length(); i++)
        {
            if(matchCount(countS1 , countS2))
                return true;
            countS2[s2.charAt(i) - 'a']--;
            countS2[s2.charAt(s1.length() + i) - 'a']++;
        }
        return matchCount(countS1,countS2);
    }
    public static boolean matchCount(int[] a , int[] b)
    {
        for(int i = 0 ; i < 26 ; i++)
        {
            if(a[i] != b[i])
                return false;
        }
        return true;
    }
}