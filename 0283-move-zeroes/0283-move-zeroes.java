class Solution {
    public void moveZeroes(int[] nums) {
        int z = -1;
        for(int i = 0 ; i < nums.length ; i++)
        {
            if(z == -1 && nums[i] == 0)
                z = i;
            if(z != -1 && nums[i] != 0)
            {
                swap(nums,z,i);
                z++;
            }
        }
    }
    void swap(int[] arr , int idx1 , int idx2)
    {
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }
}