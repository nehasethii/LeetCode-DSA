class Solution {
    public static String sortSentence(String s) {
        String[] str = s.split(" ");
        String[] str2 = new String[str.length];
        StringBuilder string = new StringBuilder();
        for(int i = 0 ; i < str.length ; i++)
        {
            int idx = str[i].charAt(str[i].length() - 1);
            str2[idx - 49] = str[i];
        }
        for(int i = 0 ; i < str2.length ; i++)
        {
            string.append(str2[i].substring(0,str2[i].length() - 1));
            if(i < str2.length - 1)
                string.append(" ");
        }
        return string.toString();
    }
}