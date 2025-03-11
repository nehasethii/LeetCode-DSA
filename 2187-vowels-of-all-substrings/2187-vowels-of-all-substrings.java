class Solution {
    public long countVowels(String word) {
        long sum = 0;
        int n = word.length();
        for(int i = 0 ; i < n ; i++){
            if(isVowel(word.charAt(i))){
                long right = 0;
                right = n - i - 1;
                sum += 1 + i + right + (i * right);
            }
        }
        return sum;
    }
    public boolean isVowel(char ch){
        return (ch == 'a') || (ch == 'e') || (ch == 'i') || (ch == 'o') || (ch == 'u'); 
    }
}