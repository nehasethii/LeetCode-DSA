class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i = 0 , j = 0;
        StringBuilder str = new StringBuilder();
        while(i != word1.length() || j != word2.length())
        {
            if(i == word1.length())
            {
                str.append(word2.substring(j,word2.length()));
                break;
            }
            else if(j == word2.length())
            {
                str.append(word1.substring(i,word1.length()));
                break;
            }
            str.append(word1.charAt(i));
            str.append(word2.charAt(j));
            i++;
            j++;
        }
        return str.toString();
    }
}