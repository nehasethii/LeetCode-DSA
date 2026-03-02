class Solution {
    public int minSwaps(int[][] grid) {
        int n = grid.length;
        int swaps = 0;
        int idx = -1;
        int[] count = new int[n];
        for(int i = 0 ; i < n ; i++){
            for(int j = n-1 ; j >= 0 ; j--){
                if(grid[i][j] == 0){
                    count[i]++;
                }
                else{
                    break;
                }
            }
        }
        for(int i = 0 ; i < n ; i++){
            if(count[i] >= (n-i-1)){
                continue;
            }
            for(int j = i + 1 ; j < n ; j++){
                if(count[j] >= (n-i-1)){
                    idx = j;
                    break;
                }
            }
            if(idx == -1){
                return -1;
            }
            for(int j = idx - 1 ; j >= i ; j--){
                int temp = count[j];
                count[j] = count[j+1];
                count[j+1] = temp; 
                swaps++;
            }
            idx = -1;
        }
        return swaps;
    }
}
// loop over row then reverse loop over j ans count trailing zeroes, when u encounter 1 break the j loop
// loop over the count of trailing zeros array if each element is >= n-i-1 then move frwd then return -1
// loop over i and check j = i + 1 to n-1 and find the row with enough trailing zeros then swap till u get the row in correct place ans increase count 