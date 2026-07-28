class Solution {
    public int findKthNumber(int m, int n, int k) {
        long low = 1;
        long high = m * n;
        int ans = 0;
        while(low <= high){
            long mid = low + (high - low)/2;
            int r = 1;
            int c = n;
            int count = 0;
            while(r <= m && c > 0){
                if((r * c) <= mid){
                    count += c;
                    r++;
                }
                else{
                    c--;
                }
            }
            if(count < k){
                low = mid + 1;
            }
            else{
                ans = (int)mid;
                high = mid - 1;
            }
        }
        return ans;
    }
}