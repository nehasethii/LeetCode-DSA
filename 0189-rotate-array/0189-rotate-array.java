class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k %= n;
        int i = 0;
        int j = n - k - 1;
        while(i < j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
        i = n - k;
        j = n - 1;
        while(i < j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
        i = 0;
        j = n - 1;
        while(i < j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
}