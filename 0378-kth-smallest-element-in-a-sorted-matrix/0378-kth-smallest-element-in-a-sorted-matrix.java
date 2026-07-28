class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;
        int low = matrix[0][0];
        int high = matrix[n-1][n-1];
        int ans = 0;
        while(low <= high){
            int mid = low + (high - low)/2;
            int r = 0;
            int c = n-1;
            int count = 0;
            while(r < n && c >= 0){
                if(matrix[r][c] <= mid){
                    count += c + 1;
                    r++;
                }
                else{
                    c--;
                }
            }
            if(count < k){
                low = mid + 1;
            }
            else{
                ans = mid;
                high = mid - 1;
            }
        }
        return ans;
    }
}