class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        //Swapping horizontally
        for(int i = 0 ; i < image.length ; i++)
        {
            int mid = image.length/2;
            for(int j = 0 ; j < mid ; j++)
            {
                int k = image[j].length - 1 - j;
                int temp = image[i][j];
                image[i][j] = image[i][k];
                image[i][k] = temp;
            }
        }
        //inverting
        for(int i = 0 ; i < image.length ; i++)
        {
            for(int j = 0 ; j < image[i].length ; j++)
            {
                if(image[i][j] == 0) image[i][j] = 1;
                else image[i][j] = 0;
            }
        }
        return image;
    }
}