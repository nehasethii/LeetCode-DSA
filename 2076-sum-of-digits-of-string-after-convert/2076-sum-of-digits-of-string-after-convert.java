class Solution {
    public int getLucky(String s, int k) {
        StringBuilder str = new StringBuilder();
        int num = 0 , sum = 0;
        for(int i = 0 ; i < s.length() ; i++)
        {
            if(s.charAt(i) >= 48 && s.charAt(i) <= 57)
                str.append(s.charAt(i) - 48);
            else
                str.append(s.charAt(i) - 96);
        }
        for(int i = 0 ; i < str.length() ; i++)
        {
            if(str.charAt(i) >= 48 && str.charAt(i) <= 57)
                sum += str.charAt(i) - 48;
            else
                sum += str.charAt(i) - 96;
        }
        int count = 1;
        num = sum;
        while(count < k)
        {
            sum = 0;
            while(num > 0)
            {
                sum += (num % 10);
                num /= 10;
            }
            num = sum;
            count++;
        }
        return num;
    }
}