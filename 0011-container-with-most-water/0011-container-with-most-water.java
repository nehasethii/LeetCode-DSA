class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int left = 0 ; 
        int right = n - 1;
        int maxWater = Integer.MIN_VALUE;
        while(left < right)
        {
            int h = Math.min(height[left],height[right]);
            int water = (right - left) * h;
            maxWater = Math.max(maxWater,water);
            while(left < right && height[left] <= h)
                left++;
            while(left < right && height[right] <= h)
                right--;
        }
        return maxWater;
    }
}