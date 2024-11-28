class Solution {
    public int myAtoi(String s) {
        int n = s.length();
        int num = 0;
        int sign = 1;
        boolean read = false;
        // for(int i = 0 ; i < s.length() ; i++)
        // {
        //     if(s.charAt(i) == ' ')  
        //         continue;
        //     else if(read == false && s.charAt(i) < '0' || s.charAt(i) > '9')
        //         break;
        //     else if(read == false && s.charAt(i) == '-') sign = 0;
        //     else if(read == true && s.charAt(i) == '-' || s.charAt(i) == '+') break;
        //     else if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
        //         break;
        //     else if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')
        //         break;
        //     else if(s.charAt(i) >= '0' && s.charAt(i) <= '9')
        //     {
        //         read = true;
        //         int digit = s.charAt(i) - '0';
        //         if(num > (Integer.MAX_VALUE - digit)/10)
        //             return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        //         num = num * 10 + digit;
        //     }
        //     else
        //         continue;
        // }
        if(n == 0)
            return 0;
        int i = 0;
        for(; i < n && s.charAt(i) == ' ' ; i++)
            continue;
        if(i < n && s.charAt(i) == '+')
        {
            sign = 1;
            i++;
        }    
        else if(i < n && s.charAt(i) == '-')
        {
            sign = -1;
            i++;
        }
        if(i < n && (s.charAt(i) < '0' || s.charAt(i) > '9'))
            return num * sign;
        while(i < n && (s.charAt(i) >= '0' && s.charAt(i) <= '9'))
        {
            int digit = s.charAt(i) - '0';
            if(num > (Integer.MAX_VALUE - digit)/10)
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            num = num * 10 + digit;
            i++;
        }
        return num * sign;
    }
}