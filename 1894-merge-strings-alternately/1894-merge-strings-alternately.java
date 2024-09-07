class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i = 0 , j = 0 , count = 0;
        StringBuilder str = new StringBuilder();
        while(str.length() < word1.length() + word2.length())
        {
            if(i == word1.length())
                str.append(word2.substring(j,word2.length()));
            else if(j == word2.length())
                str.append(word1.substring(i,word1.length()));
            else
            {
                if(count % 2 == 0)
                {    
                    str.append(word1.charAt(i));
                    i++;
                }
                else
                {
                    str.append(word2.charAt(j));
                    j++;
                }
                count++;
            }
        }
        return str.toString();
    }    
}