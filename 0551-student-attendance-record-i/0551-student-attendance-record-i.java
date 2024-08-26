class Solution {
    public boolean checkRecord(String s) {
        int absentCount = 0;
        int lateCount = 0;
        for(int i = 0 ; i < s.length() ; i++)
        {
            if((lateCount > 0) && (s.charAt(i) != 'L')) 
                    lateCount = 0; 
            if(s.charAt(i) == 'A'){
                absentCount++;
            }
            else if(s.charAt(i) == 'L'){
                lateCount++; 
            }
            if(absentCount >= 2 || lateCount >= 3)
                return false;
        }
        return true;
    }
}