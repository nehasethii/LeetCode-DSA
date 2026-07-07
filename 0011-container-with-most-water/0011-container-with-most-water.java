class Solution {
    public int maxArea(int[] height) {
        int maxWater = Integer.MIN_VALUE;
        int water = Integer.MIN_VALUE;
        int i = 0;
        int j = height.length - 1;
        while(i < j){
            int width = j - i;
            int ht = Math.min(height[i] ,height[j]);
            water = Math.max(water,ht * width);
            maxWater = Math.max(maxWater,water);
            if(height[i] < height[j]){
                i++;
            }
            else{
                j--;
            }
        }
        return maxWater;
    }
}