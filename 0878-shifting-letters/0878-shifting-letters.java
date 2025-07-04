class Solution {
    public static String shiftingLetters(String s, int[] shifts) {
        StringBuilder sb = new StringBuilder();
        long sum = 0;
        for(int i = 0 ; i < s.length() ; i++){
            sum += shifts[i];
        }
        for(int i = 0 ; i < s.length() ; i++){
            int idx = s.charAt(i) - 'a';
            sb.append((char)((idx + sum) % 26 + 'a'));
            sum -= shifts[i];
        }
        return sb.toString();
    }
}