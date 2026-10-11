class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder sb = new StringBuilder(num1);
        int n = num1.length();
        int m = num2.length();
        if(m > n){
            return addStrings(num2 , num1);
        }
        int carry = 0;
        int i = n - 1;
        int j = m - 1;
        while(i >= 0 && j >= 0){
            int res = (num1.charAt(i) - '0') + (num2.charAt(j) - '0') + carry;
            sb.replace(i , i+1 , String.valueOf(res % 10));
            carry = res/10;
            i--;
            j--;
        }
        while(i >= 0){
            int res = (num1.charAt(i) - '0') + carry;
            sb.replace(i , i+1 , String.valueOf(res % 10));
            carry = res/10;
            i--;
            if(carry == 0){
                break;
            }
        }
        if(carry > 0){
            sb.insert(0,carry);
        }
        return sb.toString();
    }
}