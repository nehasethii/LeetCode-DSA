class Solution {
    public int minMoves(int target, int maxDoubles) {
        return countMoves(target,maxDoubles,0);
    }
    public int countMoves(int target, int maxDoubles, int moves){
        if(target == 1){
            return moves;
        }
        if(target % 2 == 0 && maxDoubles > 0){
            return countMoves(target/2, maxDoubles - 1, moves + 1);
        }
        else if(maxDoubles == 0){
            return countMoves(target - target + 1, maxDoubles, moves + target - 1);
        }
        else{
            return countMoves(target - 1, maxDoubles, moves + 1);
        }
    }
}