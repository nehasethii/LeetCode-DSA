class Solution {
    public int maximumSum(int[] arr) {
        int n = arr.length;
        if(n == 1){
            return arr[0];
        }
        int noDelete = arr[0];
        int oneDelete = 0;
        int ans = arr[0];
        for(int i = 1 ; i < n ; i++){
            int prevNoDelete = noDelete;
            int prevOneDelete = oneDelete;

            noDelete = Math.max(prevNoDelete + arr[i] , arr[i]);
            oneDelete = Math.max(prevOneDelete + arr[i] , prevNoDelete);

            ans = Math.max(ans , Math.max(noDelete , oneDelete));
        }
        return ans;
    }
}