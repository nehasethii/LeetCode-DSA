class Solution {
    public String reverseWords(String s) {
        String[] str = s.split(" ");
        StringBuilder string = new StringBuilder();
        char temp;
        for(int i = 0 ; i < str.length ; i++)
        {
            StringBuilder revStr = new StringBuilder(str[i]).reverse();
            string.append(revStr);
            if(i == str.length - 1)
                continue;
            string.append(" ");
        }
        return string.toString();
    }
}