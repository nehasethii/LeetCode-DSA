class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        for(int i = 0 ; i < nums.length ; i++)
        {
            result.add(index[i],nums[i]);
        }
        int len = result.size();
        int[] target = new int[len];
        for(int i = 0 ; i < target.length ; i++)
        {
            target[i] = result.get(i);
        }
        return target;
    }
}