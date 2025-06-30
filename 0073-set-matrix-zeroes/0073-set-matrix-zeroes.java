class Solution {
    public void setZeroes(int[][] matrix) {
        boolean zeroInRow = false;
        boolean zeroInCol = false;
        for(int i = 0 ; i < matrix.length ; i++){
            if(matrix[i][0] == 0)
                zeroInRow = true;
        }
        for(int j = 0 ; j < matrix[0].length ; j++){
            if(matrix[0][j] == 0)
                zeroInCol = true;
        }
        for(int i = 1 ; i < matrix.length ; i++){
            for(int j = 1 ; j < matrix[i].length ; j++){
                if(matrix[i][j] == 0){
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }
        for(int i = 1 ; i < matrix.length ; i++){
            if(matrix[i][0] == 0){
                for(int j = 0 ; j < matrix[i].length ; j++){
                    matrix[i][j] = 0;
                }
            }
        }
        for(int j = 1 ; j < matrix[0].length ; j++){
            if(matrix[0][j] == 0){
                for(int i = 0 ; i < matrix.length ; i++){
                    matrix[i][j] = 0;
                }
            }
        }
        if(zeroInRow){
            for(int i = 0 ; i < matrix.length ; i++){
                matrix[i][0] = 0;
            }
        }
        if(zeroInCol){
            for(int j = 0 ; j < matrix[0].length ; j++){
                matrix[0][j] = 0;
            }
        }
    }
}