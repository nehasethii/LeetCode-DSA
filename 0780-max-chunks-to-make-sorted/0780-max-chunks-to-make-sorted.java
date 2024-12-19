class Solution {
    public int maxChunksToSorted(int[] arr) {
        int chunks = 0;
        int[] runningSum = new int[arr.length];
        runningSum[0] = arr[0];
        for(int i = 1 ; i < arr.length ; i++)
            runningSum[i] = runningSum[i - 1] + arr[i];
        for(int i = 0 ; i < arr.length ; i++)
        {
            if(runningSum[i] == (i * (i + 1))/2)
                chunks++;
        }
        return chunks;
    }
}
 
