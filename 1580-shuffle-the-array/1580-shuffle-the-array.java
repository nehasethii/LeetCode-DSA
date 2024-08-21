import java.util.Scanner;
class Solution {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[2*n];
        for(int i = 0 ; i < nums.length ; i++)
        {
            nums[i] = in.nextInt();
        }
        Solution sol = new Solution();
        int[] newNums = sol.shuffle(nums,n);
        for(int i = 0 ; i < newNums.length ; i++)
        {
            System.out.print(newNums[i] + " ");
        }
    }
    public int[] shuffle(int[] nums, int n) {
        int[] newNums = new int[2*n];
        int j = 0 , k = n;
        for(int i = 0 ; i < nums.length ; i++)
        {
            if(i % 2 == 0)
            {
                newNums[i] = nums[j];
                j++;
            }
            else
            {
                newNums[i] = nums[k];
                k++;
            }
        }
        return newNums;
    }
}