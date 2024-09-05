class Solution {
    public char findTheDifference(String s, String t) {
        int sumS = sumStringElements(s);
        int sumT = sumStringElements(t);
        return ((char)(sumT - sumS));
    }
    public static int sumStringElements(String s)
    {
        int sum = 0;
        for(int i = 0 ; i < s.length() ; i++)
        {
            sum += s.charAt(i);
        }
        return sum;
    }
}