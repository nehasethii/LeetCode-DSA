class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        int sum = 0;
        int count = 0;
        outer:
        for(int i = 1 ; i <= n; i++)
        {
            if(i > maxSum || sum + i > maxSum)
                break;
            for(int j = 0 ; j < banned.length ; j++)
            {
                if(i == banned[j])
                    continue outer;
            }
            sum += i;
            count++;
        }
        return count;
    }
}