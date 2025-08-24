class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int start = 0 , end = n - 1;
        int maxWater = 0;
        while(start < end){
            int water = Math.min(height[start],height[end]) * (end - start);
            maxWater = Math.max(maxWater , water);
            if(height[start] <= height[end]){
                start++;
            }
            else{
                end--;
            }
        }
        return maxWater;
    }
}