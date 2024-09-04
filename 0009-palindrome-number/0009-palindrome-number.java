class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0)
            return false;
        if(x >= 0 && x <= 9)
            return true;
        int orgNum = x;
        int rvrsNum = 0 , rem = 0;
        while(x > 0)
        {
            rvrsNum = (rvrsNum * 10) + (x % 10); 
            x /= 10;
        }
        return (rvrsNum == orgNum);
    }
}