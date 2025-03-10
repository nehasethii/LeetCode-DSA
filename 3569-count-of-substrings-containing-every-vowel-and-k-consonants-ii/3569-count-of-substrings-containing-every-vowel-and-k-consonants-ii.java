class Solution {
    public long countOfSubstrings(String word, int k) {
        return substringCount(word,k) - substringCount(word,k+1);
    }

    private long substringCount(String word,int k){
        String vowel = "aeiou";
        int freq[] = new int[5];
        int consonents = 0;
        long count = 0;
        int left = 0 , right = 0;
        while(right < word.length()){
            char ch = word.charAt(right);
            if(isConsonent(ch))
                consonents++;
            else 
                freq[vowel.indexOf(ch)]++;
            while(consonents >= k && hasAllVowels(freq)){
                count += word.length() - right;
                ch = word.charAt(left);
                left++;
                if(isConsonent(ch))
                    consonents--;
                else
                    freq[vowel.indexOf(ch)]--;
            }
            right++;
        }
        return count;
    }
    private boolean isConsonent(char ch){
        return (ch != 'a') && (ch != 'e') && (ch != 'i') && (ch != 'o') && (ch != 'u');
    }
    private boolean hasAllVowels(int[] freq){
        return (freq[0] > 0) && (freq[1] > 0) && (freq[2] > 0) && (freq[3] > 0) && (freq[4] > 0);
//        for (int i = 0; i < 5; i++) {
//            if(freq[i] == 0)
//                return false;
//        }
//        return true;
    }
}