class Solution {
    public int minSteps(int n) {
        int count = 0;
        if(n == 0 || n == 1)
            return 0;
        if(isPrime(n))
            return n;
        if(n % 2 == 0)
            return (2 + minSteps(n / 2));
        else if(n % 3 == 0)
            return (3 + minSteps(n / 3));
        else
        {
            int max = Integer.MIN_VALUE;
            for(int i = 2 ; i < n ; i++)
            {
                if(n % i == 0)
                    if(i > max)
                        max = i;
            }
            return minSteps(max) + (n / max);
        }
            //return (1 + minSteps(n - 1));
    }
    public static boolean isPrime(int n)
    {
        for(int i = 2 ; i < n ; i++)
        {
            if((n % i) == 0)
                return false;
        }
        return true;
    }
}