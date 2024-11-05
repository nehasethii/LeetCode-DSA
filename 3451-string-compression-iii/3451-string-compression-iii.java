class Solution {
    public String compressedString(String word) {
        StringBuilder result = new StringBuilder();
        int count = 1;
        if(word.length() == 1)
            return (1 + word);
        for(int i = 1 ; i < word.length() ; i++)
        {
            if(count < 9 && (word.charAt(i) == word.charAt(i - 1)))
                count++;
            else
            {
                result.append(count + String.valueOf(word.charAt(i - 1)));
                count = 1;
            }
        }
        result.append(count + String.valueOf(word.charAt(word.length() - 1)));
        return result.toString();
    }
}