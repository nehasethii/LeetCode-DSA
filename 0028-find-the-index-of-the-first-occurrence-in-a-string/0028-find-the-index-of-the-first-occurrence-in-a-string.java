class Solution {
    public int strStr(String haystack, String needle) {
        if(!(haystack.contains(needle)))
            return -1;
        int startIdx = haystack.indexOf(needle.charAt(0));
        int i = startIdx ;
        while(i < haystack.length())
        {
            if((haystack.substring(i , i + needle.length())).equals(needle))
                return i;
            i++;
        }
        return -1;
    }
}