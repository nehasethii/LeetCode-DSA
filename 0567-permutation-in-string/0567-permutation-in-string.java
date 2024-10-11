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
        for(int i = 0 ; i < s2.length() - s1.length() ; i++)
        {
            if(matchFound(countS2,countS1))
                return true;
            else
            {
                countS2[s2.charAt(i) - 'a']--;
                countS2[s2.charAt(i + s1.length()) - 'a']++;
            }
        }
        return (matchFound(countS2,countS1));
    }
    static boolean matchFound(int[] A,int[] B)
    {
        for(int i = 0 ; i < 26 ; i++)
        {
            if(A[i] != B[i])
                return false;
        }
        return true;
    }
}