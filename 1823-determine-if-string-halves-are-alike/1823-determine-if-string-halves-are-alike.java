class Solution {
    public boolean halvesAreAlike(String s) {
        int mid = s.length() / 2;
        int a = 0 , b = 0;
        for(int i = 0 ; i < mid ; i++)
        {
            int j = s.length() - 1 - i;
            if("aeiouAEIOU".indexOf(s.charAt(i)) != -1)
                a++;
            if("aeiouAEIOU".indexOf(s.charAt(j)) != -1)
                b++;
        }
        if(a == b){
            return true;
        }
        return false;
    }
}