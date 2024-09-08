class Solution {
    public int reverse(int x) {
        String str = Integer.toString(x);
        StringBuilder sb = new StringBuilder(str);
        int orgNum = x;
        int reverseNum = 0 , remainder = 0;
        if(x < 0)
            x = -x;
        if ( x > 0 ){
            while(x > 0)
            {
                if(reverseNum > Integer.MAX_VALUE/10) 
                {
                    return 0;
                } 
                remainder = x % 10;
                reverseNum = reverseNum * 10 + remainder;
                x /= 10;
            }
        }  
        if(orgNum < 0)
            return -reverseNum;
        return reverseNum;
    }
}