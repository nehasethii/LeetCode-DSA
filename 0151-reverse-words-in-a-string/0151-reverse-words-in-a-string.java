class Solution {
    public String reverseWords(String s) {
        String str = "";
        int i = s.length() - 1;
        while(i >= 0 && s.charAt(i) == ' ')
            i--;
        int j = i;
        while(i >= 0){
            if(s.charAt(i) != ' ')
                i--;
            else{
                if(str.equals(""))
                    str += s.substring(i+1,j+1);
                else
                    str += s.substring(i,j+1);
                while(i >= 0 && s.charAt(i) == ' ')
                    i--;
                j = i;
            }
        }
        if(j != i){
            if(!str.equals(""))
                str += " ";
            str += s.substring(i+1,j+1);
        }
        return str;
    }
}