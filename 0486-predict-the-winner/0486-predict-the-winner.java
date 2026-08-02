class Solution {
    public boolean predictTheWinner(int[] nums) {
        int n = nums.length;
        return predict(nums,0,n-1,0,0,1,false);
    }
    public boolean predict(int[] nums , int i , int j , int score1 , int score2 , int turn, boolean canWin){
        if(turn > nums.length){
            canWin = canWin || (score1 >= score2);
            return canWin;
        }
        //Player 1
        if(turn % 2 != 0){ 
            boolean left = predict(nums,i+1,j,score1 + nums[i],score2,turn + 1, canWin);
            boolean right = predict(nums,i,j-1,score1 + nums[j],score2,turn + 1,canWin);
            canWin = left || right;
        }
        //Player 2
        else{
            boolean left = predict(nums,i+1,j,score1,score2 + nums[i],turn + 1,canWin);
            boolean right = predict(nums,i,j-1,score1,score2 + nums[j],turn + 1,canWin);
            canWin = left && right;
        }
        return canWin;
    }
}