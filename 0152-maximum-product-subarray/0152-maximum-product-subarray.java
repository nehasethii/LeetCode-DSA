class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int prefixProd = 1;
        int suffixProd = 1;
        int maxProd = Integer.MIN_VALUE;
        for(int i = 0 ; i < n ; i++){
            if(prefixProd == 0){
                prefixProd = 1;
            }
            if(suffixProd == 0){
                suffixProd = 1;
            }
            prefixProd *= nums[i];
            suffixProd *= nums[n - i - 1];
            maxProd = Math.max(maxProd , Math.max(prefixProd , suffixProd));
        }
        return maxProd;
    }
}