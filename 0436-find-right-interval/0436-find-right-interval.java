class Solution {
    public int[] findRightInterval(int[][] intervals) {
        if(intervals.length == 1)
        {
            if(intervals[0][0] >= intervals[0][1])
                return new int[]{0};
            return new int[]{-1};
        }
        int[] ans = new int[intervals.length];
        for(int i = 0 ; i < intervals.length ; i++)
        {
            int min = Integer.MAX_VALUE;
            for(int j = 0 ; j < intervals.length ; j++)
            {
                int startJ = intervals[j][0];
                if(intervals[j][0] >= intervals[i][1] && startJ < min)
                {
                    ans[i] = j;
                    min = Math.min(min,startJ);
                }
            }
            if(min == Integer.MAX_VALUE)
                ans[i] = -1;
        }
        return ans;
    }
}