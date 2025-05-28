class Solution {
    public int reverse(int x) {
        int orgNum = x;
        int revNum = 0;
        if(x < 0)
            x = -x;
        while(x > 0){
            int rem = x % 10;
            int temp = revNum * 10 + rem;
            if(revNum > ((int)Math.pow(2,31) - 1 - rem )/10)
                return 0;
            else
                revNum = temp;
            x /= 10;
        }
        if(orgNum < 0)
            revNum = -revNum;
        return revNum;












        // String str = Integer.toString(x);
        // StringBuilder sb = new StringBuilder(str);
        // int orgNum = x;
        // int reverseNum = 0 , remainder = 0;
        // if(x < 0)
        //     x = -x;
        // if ( x > 0 ){
        //     while(x > 0)
        //     {
        //         if(reverseNum > Integer.MAX_VALUE/10) 
        //         {
        //             return 0;
        //         } 
        //         remainder = x % 10;
        //         reverseNum = reverseNum * 10 + remainder;
        //         x /= 10;
        //     }
        // }  
        // if(orgNum < 0)
        //     return -reverseNum;
        // return reverseNum;
    }
}