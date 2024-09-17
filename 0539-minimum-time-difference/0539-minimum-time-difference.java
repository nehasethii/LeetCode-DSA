class Solution {
    public int findMinDifference(List<String> timePoints) {
        int[] minutes = new int[timePoints.size()];
        //converting to minutes
        int min = 0;
        for(int i = 0 ; i < timePoints.size() ; i++)
        {
            if((Integer.valueOf(timePoints.get(i).substring(0,2))).equals("00"))
            {
                min = 24 * 60;
            }
            else
            {
                min = (Integer.valueOf(timePoints.get(i).substring(0,2)) * 60 );
            }
            min += Integer.valueOf(timePoints.get(i).substring(3,5));
            minutes[i] = min;
        }
        int minimum = Integer.MAX_VALUE;
        for(int i = 0 ; i < minutes.length ; i++)
        {
            for(int j = i+1 ; j < minutes.length ; j++)
            {
                minimum = Integer.min(minimum , Math.abs(minutes[i] - minutes[j]));
                minimum = Math.min(minimum,Math.abs(1440 - Math.abs(minutes[i] - minutes[j])));
            }
        }
        return minimum;
    }
}