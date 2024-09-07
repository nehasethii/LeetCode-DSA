class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int size = m + n;
        int[] result = new int[size];
        int i = 0 , j = 0;
        for(int k = 0 ; k < result.length ; k++)
        {
            if(i >= m)
            {
                result[k] = nums2[j];
                j++;
            }
            else if(j >= n)
            {
                result[k] = nums1[i];
                i++;
            }
            else
            {
                if(nums2[j] <= nums1[i])
                {
                    result[k] = nums2[j];
                    j++;
                }
                else if(nums1[i] <= nums2[j])
                {
                    result[k] = nums1[i];
                    i++;
                }
            }
        } 
        if(size % 2 != 0)
            return result[size/2];
        else
            return ((double)(result[size/2 - 1] + result[size/2])/2);
    }
}