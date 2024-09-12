class Solution {
    public int countOdds(int low, int high) {
        ///int count = 0;
        if((high - low + 1) % 2 == 0)
            return (high - low + 1)/2;
        else
            if(low % 2 != 0)
                return ((high - low)/ 2 + 1);
            else 
                return ((high - low)/ 2);
        // for(int i = low ; i <= high ; i++)
        // {
        //     if(i % 2 != 0)
        //         count++;
        // }
        // return count;
    }
}