class Solution {
    public int[] resultsArray(int[] nums, int k) {
        int n = nums.length;
        int[] result = new int[n - k + 1];
        int left = 0;
        if(k == 1)
            return nums;
        for(int i = 0 ; i < result.length ; i++)
        {
            result[i] = calcPower(nums,k,left);
            left++;
        }
        return result;
    }
    int calcPower(int[] arr , int k , int left)
    {
        int max = Integer.MIN_VALUE;
        for(int i = left + 1 ; i < left + k ; i++)
        {
            if(arr[i] != arr[i-1] + 1)
                return -1;
            if(arr[i] > max)
                max = arr[i];
        }
        return max;
    }
}