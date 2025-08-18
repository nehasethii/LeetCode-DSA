class Solution {
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int r = rStart , c = cStart;
        int[][] ans = new int[rows*cols][2];
        int count = 1;
        int inc = 1;
        ans[0][0] = r;
        ans[0][1] = c;
        while(count < rows * cols){
            for(int i = 0 ; i < inc ; i++){
                c++;
                if(r >= 0 && c >= 0 && r < rows && c < cols){
                    ans[count][0] = r;
                    ans[count][1] = c;
                    count++;
                }
            }
            for(int i = 0 ; i < inc ; i++){
                r++;
                if(r >= 0 && c >= 0 && r < rows && c < cols){
                    ans[count][0] = r;
                    ans[count][1] = c;
                    count++;
                }
            }
            inc++;
            for(int i = 0 ; i < inc ; i++){
                c--;
                if(r >= 0 && c >= 0 && r < rows && c < cols){
                    ans[count][0] = r;
                    ans[count][1] = c;
                    count++;
                }
            }
            for(int i = 0 ; i < inc ; i++){
                r--;
                if(r >= 0 && c >= 0 && r < rows && c < cols){
                    ans[count][0] = r;
                    ans[count][1] = c;
                    count++;
                }
            }
            inc++;
        }
        return ans;
    }
}