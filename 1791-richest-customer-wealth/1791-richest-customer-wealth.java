import java.util.Scanner;
class Solution {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        int[][] accounts = new int[m][n];
        for(int i = 0 ; i < m ; i++)
        {
            for(int j = 0 ; j < n ; j++)
            {
                accounts[i][j] = in.nextInt();
            }
        }
        Solution sol = new Solution();
        int max = sol.maximumWealth(accounts);
        System.out.println(max);
    }
    public int maximumWealth(int[][] accounts) {
        int max = 0 , sum;
        for(int i = 0 ; i < accounts.length ; i++)
        {
            sum = 0;
            for(int j = 0 ; j < accounts[i].length ; j++)
            {
                sum += accounts[i][j];
            }
            if(sum > max)
            {
                max = sum;
            }
        }
        return max;
    }
}