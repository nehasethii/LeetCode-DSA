class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int size = m + n;
        int[] result = new int[size];
        int i = 0;
        int j = 0;
        int idx = 0;
        while(i < m && j < n)
        {
            if(nums1[i] < nums2[j])
                result[idx++] = nums1[i++];
            else
                result[idx++] = nums2[j++];
        }
        while(i < m)
            result[idx++] = nums1[i++];
        while(j < n)
            result[idx++] = nums2[j++];

        if(size % 2 != 0)
            return result[(m + n)/2];
        else
            return (double)(result[size/2 - 1] + result[size/2])/2;
    }
}