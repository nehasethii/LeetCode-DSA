class Solution {
    public int romanToInt(String s) {
        int num = 0;
        for(int i = s.length() - 1 ; i >= 0  ; i--)
        {
            if(s.charAt(i) == 'I'){
                num++;
            }
            else if(s.charAt(i) == 'V'){
                num += 5;
                if((i != 0) && (s.charAt(i - 1) == 'I')){
                    num--;
                    i--;
                }
            }
            else if(s.charAt(i) == 'X')
            {    
                num += 10; 
                if((i != 0) && (s.charAt(i - 1) == 'I')){
                    num--;
                    i--;
                }  
            }
            else if(s.charAt(i) == 'L'){
                num += 50;
                if((i != 0) && (s.charAt(i - 1) == 'X')){
                    num -= 10;
                    i--;
                }
            }
            else if(s.charAt(i) == 'C')
            {    
                num += 100;
                if((i != 0) && (s.charAt(i - 1) == 'X')){
                    num -= 10;
                    i--;
                }
            }
            else if(s.charAt(i) == 'D'){
                num += 500;
                if((i != 0) && (s.charAt(i - 1) == 'C')){
                    num -= 100;
                    i--;
                }
            }
            else if(s.charAt(i) == 'M'){
                num += 1000;
                if((i != 0) && (s.charAt(i - 1) == 'C')){
                    num -= 100;
                    i--;
                }
            }
        }
        return num;
    }
}