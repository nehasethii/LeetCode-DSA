class Solution {
    public String multiply(String num1, String num2) {
        int n = num1.length();
        int m = num2.length();
        if((n == 1 && num1.charAt(0) == '0') || (m == 1 && num2.charAt(0) == '0')){
            return "0";
        }
        StringBuilder ans = new StringBuilder();
        for(int i = n - 1 ; i >= 0 ; i--){
            StringBuilder sb = new StringBuilder();
            int carry = 0;
            for(int k = i ; k < n - 1 ; k++){
                sb.append('0');
            }
            for(int j = m - 1 ; j >= 0 ; j--){
                int a = num1.charAt(i) - '0';
                int b = num2.charAt(j) - '0';
                int res = b * a;
                res += carry;
                sb.append(res % 10);
                carry = res/10;
            }
            if(carry > 0){
                sb.append(carry);
            }
            ans = add(ans,sb.reverse());
        }
        return ans.toString();
    }
    public StringBuilder add(StringBuilder num1, StringBuilder num2) {
        int n = num1.length();
        int m = num2.length();
        if(m > n){
            return add(num2 , num1);
        }
        int carry = 0;
        int i = n - 1;
        int j = m - 1;
        while(i >= 0 && j >= 0){
            int res = (num1.charAt(i) - '0') + (num2.charAt(j) - '0') + carry;
            num1.replace(i , i+1 , String.valueOf(res % 10));
            carry = res/10;
            i--;
            j--;
        }
        while(i >= 0){
            int res = (num1.charAt(i) - '0') + carry;
            num1.replace(i , i+1 , String.valueOf(res % 10));
            carry = res/10;
            i--;
            if(carry == 0){
                break;
            }
        }
        if(carry > 0){
            num1.insert(0,carry);
        }
        return num1;
    }
}