class Solution {
    public int findNumbers(int[] nums) {
        int evenCount = 0 ;
        for( int n : nums)
        {
            int numOfDigits = 0;
            while(n > 0)
            {
                numOfDigits++;
                n /= 10;
            }
            if(numOfDigits % 2 == 0)
            {
                evenCount++;
            }
        }
        return evenCount;
    }
}