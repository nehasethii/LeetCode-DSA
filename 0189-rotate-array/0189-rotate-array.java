class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        if(k == 0){
            return;
        }
        int[] val = new int[k];
        int idx = 0;
        for(int i = n - k ; i < n ; i++){
            val[idx++] = nums[i];
        }
        idx = n - k - 1;
        for(int i = n-1 ; i >= 0 ; i--){
            if(i >= k){
                nums[i] = nums[idx--]; 
            }
            else{
                nums[i] = val[i];
            }
        }
    }
}