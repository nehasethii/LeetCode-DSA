class Solution {
    public int secondsBetweenTimes(String startTime, String endTime) {
        int sec = 0;
        int h1 = (startTime.charAt(0) - '0') * 10 + (startTime.charAt(1) - '0');
        int m1 = (startTime.charAt(3) - '0') * 10 + (startTime.charAt(4) - '0');
        int s1 = (startTime.charAt(6) - '0') * 10 + (startTime.charAt(7) - '0');
        int h2 = (endTime.charAt(0) - '0') * 10 + (endTime.charAt(1) - '0');
        int m2 = (endTime.charAt(3) - '0') * 10 + (endTime.charAt(4) - '0');
        int s2 = (endTime.charAt(6) - '0') * 10 + (endTime.charAt(7) - '0');

        sec += s2 - s1;
        sec += (m2 - m1) * 60;
        sec += (h2 - h1) * 3600;
        return sec;
    }
}