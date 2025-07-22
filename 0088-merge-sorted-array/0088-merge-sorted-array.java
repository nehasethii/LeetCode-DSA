class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1 , j = n - 1;
        int idx = m + n - 1;
        while(i >= 0 && j >= 0){
            if(nums1[i] > nums2[j]){
                nums1[idx] = nums1[i--];
            }
            else if(nums1[i] < nums2[j]){
                nums1[idx] = nums2[j--];
            }
            else{
                nums1[idx--] = nums1[i--];
                nums1[idx] = nums2[j--];
            }
            idx--;
        }
        for(int x = idx ; x >= 0 ; x--){
            if(i >= 0)
                nums1[x] = nums1[i--];
            else
                break;
        }
        for(int x = idx ; x >= 0 ; x--){
            if(j >= 0)
                nums1[x] = nums2[j--];
            else
                break;
        }
    }
}