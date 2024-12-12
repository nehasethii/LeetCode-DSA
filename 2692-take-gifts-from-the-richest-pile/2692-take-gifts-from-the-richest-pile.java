class Solution {
    public long pickGifts(int[] gifts, int k) {
        long sum = 0;
        for(int i = 0; i < k ; i++)
        {
            int idxOfMax = 0;
            for(int j = 1 ; j < gifts.length ; j++)
            {
                if(gifts[j] > gifts[idxOfMax])
                    idxOfMax = j;
            }
            gifts[idxOfMax] = (int)Math.sqrt(gifts[idxOfMax]);
        }
        for(int i = 0 ; i < gifts.length ; i++)
            sum += gifts[i];
        return sum;
    }
}