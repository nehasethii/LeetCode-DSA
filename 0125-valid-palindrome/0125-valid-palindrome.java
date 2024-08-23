class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder str = new StringBuilder();
        for(int i = 0 ; i < s.length() ; i++)
        {
            if((s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')
            || (s.charAt(i) >= '0' && s.charAt(i) <= '9'))
            {
                str.append(s.charAt(i));
            }
        }
        String string = str.toString().toLowerCase();
        if(string.equals(""))
        {
            return true;
        }
        for(int i = 0 ; i <= string.length() / 2 ; i++)
        {
            int j = string.length() - 1 - i;
            if(string.charAt(i) != string.charAt(j))
            {
                return false;
            }
        }
        return true;
    }
}