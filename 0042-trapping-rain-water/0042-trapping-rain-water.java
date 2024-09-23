class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int[] left = new int[n];
        int[] right = new int[n];
        left[0]= height[0];
        for(int i = 1 ; i < n ; i++)
            left[i] = Math.max(left[i-1],height[i]);
        right[n - 1]= height[n - 1];
        for(int i = n - 2 ; i >= 0 ; i--)
            right[i] = Math.max(right[i+1],height[i]);
        int trappedWater = 0;
        for(int i = 0 ; i < n ; i++)
        {
            trappedWater += Math.min(left[i],right[i]) - height[i];
        }
        return trappedWater;
        // int i = 0 , j = height.length - 1;
        // int totalWater = 0,water = 0;
        // while(i < j)
        // {
        //     int ht = Math.min(height[i],height[j]);
        //     int width = j - i;
        //     water = ht * width;
        //     for(int k = i + 1 ; k < j ; k++)
        //     {
        //         if(water <= 0)
        //             break;
        //         water -= height[k];
        //     }
        //     totalWater = Math.max(totalWater,water);
        //     i++;
        //     j--;
        // }
        // return totalWater;
    }
}