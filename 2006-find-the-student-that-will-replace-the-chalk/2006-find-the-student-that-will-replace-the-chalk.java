class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        long sum = 0;
        for(int i = 0 ; i < chalk.length ; i++)
        {
            sum += chalk[i];
        }
        while(sum <= k)
        {
            k -= sum;
        }
        for(int i = 0 ; i < chalk.length ; i++)
        {
            if(chalk[i] > k)
                return i;
            else
                k -= chalk[i];
        }
        return 0;
    }
}