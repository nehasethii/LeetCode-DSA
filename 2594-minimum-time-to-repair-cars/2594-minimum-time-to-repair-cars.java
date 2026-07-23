class Solution {
    public long repairCars(int[] ranks, int cars) {
        int n = ranks.length;
        long min = Integer.MAX_VALUE;
        long ans = 0;
        for(int rank : ranks){
            min = Math.min(min,rank);
        }
        long low = 1;
        long high = min * cars * cars;
        while(low <= high){
            long mid = low + (high - low)/2;
            long carCount = 0;
            for(int rank : ranks){
                carCount += (long)Math.sqrt(mid/rank);
                if(carCount >= cars){
                    break;
                }
            }
            if(carCount < cars){
                low = mid + 1;
            }
            else{
                ans = mid;
                high = mid -1;
            }
        }
        return ans;
    }
}