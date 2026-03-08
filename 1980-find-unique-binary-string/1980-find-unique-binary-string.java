class Solution {
    public String findDifferentBinaryString(String[] nums) {
        int n = nums[0].length();
        int size = (int)Math.pow(2,n);
        boolean[] present = new boolean[size];
        Arrays.fill(present,false);
        for(int i = 0 ; i < nums.length ; i++){
            int idx = binaryToInt(nums[i]);
            present[idx] = true;
        }
        String ans = new String();
        for(int i = 0 ; i < size ; i++){
            if(!present[i]){
                ans = intToBinary(i,n);
                break;
            }
        }
        return ans;
    }
    public int binaryToInt(String s){
        int num = 0;
        int base = 1;
        for(int i = s.length() - 1 ; i >= 0 ; i--){
            if(s.charAt(i) == '1'){
                num += base;
            }
            base *= 2;
        }
        return num;
    }
    public String intToBinary(int num,int n){
        StringBuilder s = new StringBuilder();
        if(num == 0){
            for(int i = 0 ; i < n ; i++){
                s.append("0");
            }
            return s.toString();
        }
        while(num > 0){
            if(num == 1){
                s.insert(0,1);
            }
            else{
                s.insert(0,num % 2);
            }
            num /= 2;
        }
        while(s.length() != n){
            s.insert(0,0);
        }
        return s.toString();
    }
}