class Solution {
    public String addBinary(String a, String b) {
        StringBuilder str1 = new StringBuilder(a);
        StringBuilder str2 = new StringBuilder(b);
        StringBuilder result = new StringBuilder();
        // while(str1.length() > 0 && str1.charAt(0) == '0')
        //     str1.deleteCharAt(0);
        // while(str2.length() > 0 && str2.charAt(0) == '0')
        //     str2.deleteCharAt(0);
        while(str1.length() != str2.length())
        {
            if(str1.length() < str2.length())
                str1.insert(0,'0');
            else
                str2.insert(0,'0');
        }
        int ones = 0;
        int zeros = 0;
        int carry = 0;
        for(int i = str1.length() - 1 ; i >= 0 ; i--)
        {
            if(str1.charAt(i) == '0')
                zeros++;
            else
                ones++;
            if(str2.charAt(i) == '0')
                zeros++;
            else
                ones++;
            if(ones == 2 || zeros == 2)
            {
                if(carry == 1)
                    result.insert(0,'1');
                else
                    result.insert(0,'0');
                if(ones == 2)
                    carry = 1;
                else
                    carry = 0;
            }
            else
            {
                if(carry == 1)
                    result.insert(0,'0');
                else
                    result.insert(0,'1');
            }
            zeros = 0;
            ones = 0;
        }
        if(carry == 1)
            result.insert(0,'1');
        return result.toString();
    }
}