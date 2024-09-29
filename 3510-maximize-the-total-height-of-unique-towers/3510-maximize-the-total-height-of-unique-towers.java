class Solution {
    public long maximumTotalSum(int[] maximumHeight) {
        Arrays.sort(maximumHeight);
        int n = maximumHeight.length;
        int currentVal = maximumHeight[n-1];
        int[] maxHeight = new int[n];
        long sum = 0;
        // boolean flag = false;
        for(int i = n - 1; i >= 0 ; i--)
        {
            if(currentVal < 1)
                return -1;
            maxHeight[i] = Math.min(currentVal,maximumHeight[i]); 
            sum += maxHeight[i];
            currentVal = --maxHeight[i];
        }
        return sum;
    }
}
