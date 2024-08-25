class Solution {
    public boolean halvesAreAlike(String s) {
        int mid = s.length() / 2;
        int a = 0 , b = 0;
        for(int i = 0 ; i < mid ; i++)
        {
            int j = s.length() - 1 - i;
            if(((s.charAt(i) == 'a') || (s.charAt(i) == 'A') || (s.charAt(i) == 'e')
            ||(s.charAt(i) == 'E') || (s.charAt(i) == 'i') || (s.charAt(i) == 'I') || (s.charAt(i) ==
            'o') || (s.charAt(i) == 'O') ||(s.charAt(i) == 'u') || (s.charAt(i) == 'U')))
                a++;
            if(((s.charAt(j) == 'a') || (s.charAt(j) == 'A') || (s.charAt(j) == 'e')
            ||(s.charAt(j) == 'E') || (s.charAt(j) == 'i') || (s.charAt(j) == 'I') || (s.charAt(j) ==
            'o') || (s.charAt(j) == 'O') ||(s.charAt(j) == 'u') || (s.charAt(j) == 'U')))
                b++;
        }
        if(a == b){
            return true;
        }
        return false;
    }
}