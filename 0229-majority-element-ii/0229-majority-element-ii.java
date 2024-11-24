class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> major = new ArrayList<>();
        int n = nums.length;
        int ele1 = -1 , ele2 = -1;
        int cnt1 = 0 , cnt2 = 0;
        for(int i = 0 ; i < n ; i++)
        {
            if(nums[i] == ele1)
                cnt1++;
            else if(nums[i] == ele2)
                cnt2++;
            else if(cnt1 == 0)
            {
                ele1 = nums[i];
                cnt1 = 1;
            }
            else if(cnt2 == 0)
            {
                ele2 = nums[i];
                cnt2 = 1;
            }
            else
            {
                cnt1--;
                cnt2--;
            }
        }
        cnt1 = cnt2 = 0;
        for(int el : nums)
        {
            if(el == ele1)
                cnt1++;
            if(el == ele2)
                cnt2++;
        }
        if(cnt1 > Math.floor(n/3))
            major.add(ele1);
        if(cnt2 > Math.floor(n/3) && ele1 != ele2)
            major.add(ele2);
        if(major.size() == 2 && major.get(0) > major.get(1))
        {
            int temp = major.get(0);
            major.set(0,major.get(1));
            major.set(1,temp);
        }
        return major;
    }
}