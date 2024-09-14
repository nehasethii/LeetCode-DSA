class Solution {
    public int arraySign(int[] nums) {
        int negCount = 0 ;
        for(int el : nums)
        {
            if(el == 0)
                return 0;
            else if(el < 0)
                negCount++;
        }
        return (negCount % 2 == 0 ? 1 : -1);
    }
}