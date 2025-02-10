class Solution {
    public String clearDigits(String s) {
        List<Character> ch = new ArrayList<>();
        for(int i = 0 ; i < s.length() ; i++)
        {
            if(s.charAt(i) < '0' || s.charAt(i) > '9')
                ch.add(s.charAt(i));
            else
                ch.remove(ch.size() - 1);
        }
        s = "";
        for(int i = 0 ; i < ch.size() ; i++)
            s += ch.get(i);
        return s;
    }
}