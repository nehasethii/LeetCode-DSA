class Solution {
    public int reverse(int x) {
        boolean negative = false;
        if(x < 0){
            x = -x;
            negative = true;
        }
        if(x == 0)
            return x;
        int reverse = 0; 
        while(x > 0){
            if((Integer.MAX_VALUE - (x % 10)) / 10 < reverse){
                return 0;
            }
            reverse = reverse * 10 + (x % 10);
            x /= 10;
        }
        return (negative) ? -reverse : reverse;
    }
}