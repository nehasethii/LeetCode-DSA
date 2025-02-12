class Solution {
    public int maximumSum(int[] nums) {
        int[][] pairs = new int[nums.length][2];
        for(int i = 0 ; i < nums.length ; i++){
            pairs[i][0] = sumOfDigits(nums[i]);
            pairs[i][1] = nums[i];
        }
        Arrays.sort(pairs,Comparator.comparingInt((int[] row) -> row[0]).thenComparingInt(
            (row) -> row[1]));
        int max = -1;
        for(int i = 1 ; i < nums.length ; i++){
            if(pairs[i][0] == pairs[i-1][0])
                max = Math.max(max,(pairs[i][1] + pairs[i-1][1]));
        }
        return max;
    }
    public int sumOfDigits(int num)
    {
        int temp = 0;
        while(num > 0)
        {
            temp += num % 10;
            num /= 10;
        }
        return temp;
    }
}