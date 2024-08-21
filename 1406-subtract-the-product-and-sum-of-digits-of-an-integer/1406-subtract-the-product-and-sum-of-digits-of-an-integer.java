class Solution {
    public int subtractProductAndSum(int n) {
        int rem = 0 , sum = 0 , product = 1;
        while(n > 0)
        {
            rem = n % 10;
            sum += rem;
            product *= rem;
            n /= 10;
        }
        int difference = product - sum;
        return difference;
    }
    public void main(String[] args)
    {
        int result = subtractProductAndSum(234);
        System.out.println(result);
    }
}