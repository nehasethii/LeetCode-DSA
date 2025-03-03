class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        List<Integer> lesserElements = new ArrayList<>();
        List<Integer> greaterElements = new ArrayList<>();
        int count = 0;
        for(int num : nums){
            if(num > pivot)
                greaterElements.add(num);
            else if(num < pivot)
                lesserElements.add(num);
            else
                count++;
        }
        for(int i = 0 ; i < nums.length ; i++){
            if(i < lesserElements.size())
                nums[i] = lesserElements.get(i);
            else if((i - lesserElements.size()) < count)
                nums[i] = pivot;
            else
                nums[i] = greaterElements.get(i - lesserElements.size() - count);
        }
        return nums;
        // int i = 0;
        // while(i < lesserElements.size()){
        //     nums[i++] = lesserElements.get(i);
        // }
        // int j = 0;
        // while(j < count){
        //     nums[i+j] = pivot;
        // }
    }
}