class Solution {
    public boolean isPalindrome(String s) {
        int i = 0 , j = s.length() - 1;
        while(i < j){
            char c1 = s.charAt(i);
            char c2 = s.charAt(j);
            if(!((c1 >= '0' && c1 <= '9') || (c1 >= 'A' && c1 <= 'Z') || (c1 >= 'a' && c1 <= 'z'))){
                i++;
                continue;
            } 
            if(!((c2 >= '0' && c2 <= '9') || (c2 >= 'A' && c2 <= 'Z') || (c2 >= 'a' && c2 <= 'z'))){
                j--;
                continue;
            }
            if(c1 >= 'A' && c1 <= 'Z'){
                c1 = (char)(c1 + 32);
            }
            if(c2 >= 'A' && c2 <= 'Z'){
                c2 = (char)(c2 + 32);
            }
            if(c1 == c2){
                    i++;
                    j--;
            }
            else{
                return false;
            }
        }
        return true;
    }
}