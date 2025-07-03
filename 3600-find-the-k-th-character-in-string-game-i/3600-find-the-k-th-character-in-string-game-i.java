class Solution {
    public char kthCharacter(int k) {
        String word = "a";
        while(word.length() < k){
            int n = word.length();
            for(int i = 0 ; i < n ; i++){
                if(word.charAt(i) == 'z'){
                    word += 'a';
                }
                else{
                    word += (char)(word.charAt(i) + 1);
                }
            }
        }
        return word.charAt(k-1);
    }
}