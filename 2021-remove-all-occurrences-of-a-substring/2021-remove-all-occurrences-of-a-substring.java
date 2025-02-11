class Solution {
    public String removeOccurrences(String s, String part) {
        List<Character> ch = new ArrayList<>();
        for(int i = 0 ; i < s.length() ; i++)
        {
            ch.add(s.charAt(i));
            boolean containsPart = true;
            if(ch.size() >= part.length())
            {
                for(int j = 0 ; j < part.length() ; j++)
                {
                    if(part.charAt(j) != ch.get(ch.size() - part.length() + j))
                    {
                        containsPart = false;
                        break;
                    }
                }
                if(containsPart)
                {
                    for(int j = 0 ; j < part.length() ; j++)
                        ch.remove(ch.size() - 1);
                }
            }
        }
        s = "";
        for(int i = 0 ; i < ch.size() ; i++)
            s += ch.get(i);
        return s;
    }
}