class Solution {
    public boolean validPalindrome(String s) {
        if(isPalindrome(s))
            return true;
        //StringBuilder str = new StringBuilder(s);
        for(int i = 0 ; i < s.length() ; i++)
        {
            int j = s.length() - 1 - i;
            if(s.charAt(i) != s.charAt(j))
            {
                return ((isPalindrome(s.substring(0,i) + s.substring(i+1))) ||
                (isPalindrome(s.substring(0,j) + s.substring(j+1))));
            }
            // String temp = str.deleteCharAt(i).toString();
            // if(isPalindrome(temp))
            //     return true;
        }
        return false;
    }
    public static boolean isPalindrome(String s){
        if(s.length() == 1)
            return true;
        for(int i = 0 ; i < s.length() / 2 ; i++)
        {
            int j = s.length() - 1 - i;
            if(s.charAt(i) != s.charAt(j))
            {
                return false;
            }
        }
        return true;
    }
}