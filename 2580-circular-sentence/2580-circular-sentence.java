class Solution {
    public boolean isCircularSentence(String sentence) {
        String[] s = sentence.split(" ");
        int i = 0;
        int j = s.length - 1;
        if(s[i].charAt(0) != s[j].charAt(s[j].length() - 1))
            return false;
        while(i < j)
        {
            if(s[i].charAt(s[i].length() - 1) != s[i + 1].charAt(0))
                return false;
            i++;
            if(s[j].charAt(0) != s[j - 1].charAt(s[j - 1].length() - 1))
                return false;
            j--;
        }
        return true;
    }
}