class Solution {
    public int characterReplacement(String s, int k) {
        int res = Integer.MIN_VALUE;
        int[] arr = new int[26];
        int n = s.length();
        int low = 0 , high = 0;  

        for(high = 0 ; high < n ; high++){
            arr[s.charAt(high) - 'A']++;
            int len = high - low + 1;
            int maxChar = findMax(arr);
            int diff = len - maxChar;
            while(diff > k){
                low++;
                arr[s.charAt(low-1) - 'A']--;
                len = high - low + 1;
                maxChar = findMax(arr);
                diff = len - maxChar;
            }
            res = Math.max(res,len);
        } 
        return res;
    }
    public int findMax(int[] arr){
        int max = 0;
        for(int i = 0 ; i < arr.length ; i++){
            max = Math.max(max,arr[i]);
        }
        return max;
    }
}