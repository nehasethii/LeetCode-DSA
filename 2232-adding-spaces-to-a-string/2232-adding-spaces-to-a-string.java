class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int j = 0;
        for(int k = 0 ; k < s.length(); k++)
        {
            if(j < spaces.length && k == spaces[j])
            {
                sb.append(" ");
                j++;
            }
            sb.append(s.charAt(i));
            i++;
        }
        return sb.toString();
    }
}