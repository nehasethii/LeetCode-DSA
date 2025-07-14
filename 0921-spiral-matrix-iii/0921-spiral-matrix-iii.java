class Solution {
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int inc = 1;
        int idx = 1;
        int r = rStart , c = cStart;
        int l = rows * cols;
        int[][] spiral = new int[rows * cols][2];
        spiral[0][0] = r;
        spiral[0][1] = c;
        outer :
        while(idx < l){
            for(int i = 1 ; i <= inc ; i++){
                c++;
                if(c < cols && r < rows && r >= 0 && c >= 0){
                    spiral[idx][0] = r;
                    spiral[idx][1] = c;
                    idx++;
                    if(idx >= l)
                        break outer;
                }
            }
            for(int i = 1 ; i <= inc ; i++){
                r++;
                if(c < cols && r < rows && r >= 0 && c >= 0){
                    spiral[idx][0] = r;
                    spiral[idx][1] = c;
                    idx++;
                    if(idx >= l)
                        break outer;
                }
            }
            for(int i = 1 ; i <= inc + 1 ; i++){
                c--;
                if(c < cols && r < rows && r >= 0 && c >= 0){
                    spiral[idx][0] = r;
                    spiral[idx][1] = c;
                    idx++;
                    if(idx >= l)
                        break outer;
                }
            }
            for(int i = 1 ; i <= inc + 1; i++){
                r--;
                if(c < cols && r < rows && r >= 0 && c >= 0){
                    spiral[idx][0] = r;
                    spiral[idx][1] = c;
                    idx++;
                    if(idx >= l)
                        break outer;
                }
            }
            inc += 2;
        }
        return spiral;
    }
}