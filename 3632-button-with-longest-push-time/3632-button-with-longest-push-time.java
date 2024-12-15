class Solution {
    public int buttonWithLongestTime(int[][] events) {
        int buttonIdx = events[0][0];
        int maxTime = events[0][1];
        for(int i = 1; i < events.length ; i++)
        {
            if((events[i][1] - events[i-1][1]) > maxTime)
            {
                maxTime = events[i][1] - events[i-1][1];
                buttonIdx = events[i][0];
            }
            else if((events[i][1] - events[i-1][1]) == maxTime)
            {
                buttonIdx = Math.min(buttonIdx,events[i][0]);
            }
        }
        return buttonIdx;
    }
}