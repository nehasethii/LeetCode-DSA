class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        Map<Integer,Integer> map = new HashMap<>();
        for(int[] el : nums1){
            map.put(el[0],el[1]);
        }
        for(int[] el : nums2){
            if(map.containsKey(el[0]))
                map.put(el[0],map.get(el[0])+el[1]);
            else
                map.put(el[0],el[1]);
        }
        int[][] mergedNums = new int[map.size()][2];
        int i = 0,j = 0,idx = 0;
        while(idx < mergedNums.length){
            if(i < n1 && j < n2){
                if(nums1[i][0] < nums2[j][0]){
                    mergedNums[idx][0] = nums1[i][0];
                    mergedNums[idx][1] = map.get(nums1[i][0]);
                    i++;
                }
                else if(nums1[i][0] > nums2[j][0]){
                    mergedNums[idx][0] = nums2[j][0];
                    mergedNums[idx][1] = map.get(nums2[j][0]);
                    j++;
                }
                else{
                    mergedNums[idx][0] = nums1[i][0];
                    mergedNums[idx][1] = map.get(nums1[i][0]);
                    i++;
                    j++;
                }
            }
            else if(i == n1 && j < n2){
                mergedNums[idx][0] = nums2[j][0];
                mergedNums[idx][1] = map.get(nums2[j][0]);
                j++;
            }
            else if(i < n1 && j == n2){
                mergedNums[idx][0] = nums1[i][0];
                mergedNums[idx][1] = map.get(nums1[i][0]);
                i++;
            }
            idx++;
        }
        return mergedNums;
    }
}