class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        boolean r0 = true , r90 = true , r180 = true , r270 = true ;
        int n = mat.length;
        for(int i = 0 ; i < n ; i++)
        {
            for(int j = 0 ; j < mat[0].length ; j++)
            {
                //0 deg
                if((mat[i][j]) != (target[i][j]))
                {
                    r0 = false;
                } 
                //90 deg
                if((mat[j][n - 1 - i]) != (target[i][j]))
                {
                    r90 = false;
                } // 180 deg
                if((mat[n - 1 - i][n - 1-j]) != (target[i][j]))
                {
                    r180 = false;
                }//270 deg
                if((mat[n - 1 - j][i]) != (target[i][j]))
                {
                    r270 = false;
                }
            }
        }
        if( r0 || r90 || r180 || r270 )
        {
            return true;
        }
        return false;
    }
}