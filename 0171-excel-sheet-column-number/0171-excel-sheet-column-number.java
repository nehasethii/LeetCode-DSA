class Solution {
    public int titleToNumber(String columnTitle) {
        int result = 0;
        result += ((columnTitle.charAt(0) + 1) - 'A');
        for(int i = 1 ; i < columnTitle.length() ; i++)
        {
            result *= 26;
            result += ((columnTitle.charAt(i) + 1) - 'A');
        }
        return result;
    }
}