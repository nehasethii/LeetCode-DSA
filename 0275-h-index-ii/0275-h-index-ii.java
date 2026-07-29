class Solution {
    public int hIndex(int[] citations) {
        int n = citations.length;
        int low = 0;
        int high = n - 1;
        int ans = 0;
        while(low <= high){
            int mid = low + (high - low)/2;
            int papers = n - mid;
            if(papers <= citations[mid]){
                ans = papers;
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return ans;
    }
}