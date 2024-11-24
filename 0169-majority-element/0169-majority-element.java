class Solution {
    public int majorityElement(int[] nums) {
        int el = -1;
        int cnt = 0;
        for(int i = 0 ; i < nums.length ; i++)
        {
            if(nums[i] == el)
                cnt++;
            else if(cnt == 0)
                el = nums[i];
            else
                cnt--;
        }
        return el;
    }
}