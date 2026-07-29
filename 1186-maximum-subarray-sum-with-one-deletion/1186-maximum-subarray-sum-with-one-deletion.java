class Solution {
    public int maximumSum(int[] arr) {
        int n = arr.length;
        int ans = arr[0];
        int oneDel = 0;
        int noDel = arr[0];
        for(int i = 1 ; i < n ; i++){
            int prevOneDel = oneDel;
            int prevNoDel = noDel;
            oneDel = Math.max(prevOneDel + arr[i], prevNoDel);
            noDel = Math.max(prevNoDel + arr[i], arr[i]);
            ans = Math.max(ans , Math.max(oneDel, noDel));
        }
        return ans;
    }
}