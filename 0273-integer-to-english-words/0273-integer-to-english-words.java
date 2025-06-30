class Solution {
    public String numberToWords(int num) {
        int orgNum = num;
        int[] value = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,
                        30,40,50,60,70,80,90,100,1000,1000000,1000000000} ;
        String[] number = {"One","Two","Three","Four","Five","Six","Seven",
       "Eight","Nine","Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen",
       "Sixteen","Seventeen","Eighteen","Nineteen","Twenty","Thirty","Forty",
       "Fifty","Sixty","Seventy","Eighty","Ninety","Hundred","Thousand",
       "Million","Billion"};
        int index = 30;
        StringBuilder sb = new StringBuilder();
        while(num > 0){
            if(num < value[index]){
                index--;
            }
            else{
                if(value[index] >= 100){
                    sb.append(numberToWords(num/value[index]) + " " + number[index] + " ");
                    num %= value[index];
                }
                else {
                    sb.append(number[index] + " ");
                    num -= value[index];
                }
            }
        }
        String ans = sb.toString();
        if(orgNum == 0){
            return "Zero";
        }
        return ans.trim();
    }
}