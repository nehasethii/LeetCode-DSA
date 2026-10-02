class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;
        for(int[] acc : accounts){
            int sum = 0;
            for(int money : acc){
                sum += money;
            }
            max = Math.max(max,sum);
        }
        return max;
    }
}