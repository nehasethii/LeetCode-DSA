class Solution {
    public int minCostToMoveChips(int[] position) {
        int evenPositions = 0 , oddPositions = 0;
        for(int i = 0 ; i < position.length ; i++ )
        {
            if(position[i] % 2 == 0) evenPositions++;
            else oddPositions++;
        }
        if(evenPositions == position.length || oddPositions == position.length) 
            return 0;
        return Math.min(evenPositions,oddPositions);
    }
}