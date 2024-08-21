class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        int rem = 0 ,carry = 0 , i = num.length - 1;
        while(k > 0 || carry == 1)
        {
            rem = k % 10;
            if(i < 0 && k > 0)
            {
                carry += k;
                break;
            }
            if(i < 0)
            {
                break;
            }
            if((num[i] + rem + carry) < 10)
            {
                num[i] += rem + carry;
                carry = 0;
            }
            else
            {
                num[i] = (num[i] + rem + carry) % 10;
                carry = 1;
            }
            i--;
            k /= 10;
        }
        List<Integer> result = new ArrayList<Integer>();
        while(carry > 0)
        {
            int temp = carry % 10;
            result.add(0,temp);
            carry /= 10;
        }
        for(int j = 0 ; j < num.length ; j++)
        {
            result.add(num[j]);
        }
        return result;
    }
}