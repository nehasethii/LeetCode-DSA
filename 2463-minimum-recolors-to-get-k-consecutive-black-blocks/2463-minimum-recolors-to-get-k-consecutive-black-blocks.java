class Solution {
    public int minimumRecolors(String blocks, int k) {
        int white = 0 , black = 0;
        int minOperations = Integer.MAX_VALUE;
        for(int i = 0 ; i < k ; i++){
            if(blocks.charAt(i) == 'W')
                white++;
            else
                black++;
        }
        minOperations = Math.min(minOperations,white);
        for(int i = 0 ; i < blocks.length() - k ; i++){
            if(blocks.charAt(k+i) != blocks.charAt(i)){
                if(blocks.charAt(k+i) == 'W'){
                    white++;
                    black--;
                }
                else{
                    black++;
                    white--;
                }
            }
            minOperations = Math.min(minOperations,white);
        }
        return minOperations;
    }
}