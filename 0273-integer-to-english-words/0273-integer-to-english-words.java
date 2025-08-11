class Solution {
    public String numberToWords(int num) {
        if(num == 0){
            return "Zero";
        }
        String[] words = {"One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten",
        "Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen",
        "Nineteen","Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety",
        "Hundred","Thousand","Million","Billion"};
        int[] value = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,30,40,50,60,70,80,90,100,
        1000,1000000,1000000000};
        int idx = value.length - 1;
        StringBuilder sb = new StringBuilder();
        while(num > 0){
            if(num >= 100 && num >= value[idx]){
                sb.append(numberToWords(num/value[idx]) + " ");
                sb.append(words[idx] + " ");
                num %= value[idx];
            }
            else if(num >= value[idx]){
                sb.append(words[idx] + " ");
                num -= value[idx];
            }
            else{
                idx--;
            }
        }
        return sb.toString().trim();
    }
}