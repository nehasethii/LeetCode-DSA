class Solution {
    public boolean checkIfPangram(String sentence) {
        int[] isPresent = new int[26];
        if (sentence.length() < 26) {
            return false;
        }
        for(int i = 0 ; i < sentence.length() ; i++)
        {
            isPresent[sentence.charAt(i) - 97]++;
        }
        for (int i = 0; i < 26; i++) {
            if (isPresent[i] == 0) {
                return false;
            }
        }
        return true;
    }
}
