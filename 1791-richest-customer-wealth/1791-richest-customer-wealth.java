class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        for(int[] acc : accounts)
        {
            int wealth = 0;
            for(int money : acc)
                wealth += money;
            max = Math.max(max,wealth);
        }
        return max;
    }
}