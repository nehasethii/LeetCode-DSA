class Solution {
    public String intToRoman(int num) {
        int[] value = {1,4,5,9,10,40,50,90,100,400,500,900,1000};
        String[] symbol = {"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};
        StringBuilder sb = new StringBuilder();
        int index = 12;
        while(num > 0){
            if(num >= value[index]){
                sb.append(symbol[index]);
                num -= value[index];
            }
            else{
                index--;
            }
        }
        return sb.toString();
    }
}