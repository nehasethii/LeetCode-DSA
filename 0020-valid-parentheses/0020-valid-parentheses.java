class Solution {
    public boolean isValid(String s) {
        ArrayList<Character> p = new ArrayList<>();
        for(int i = 0 ; i < s.length() ; i++)
        {
            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{')
                p.add(s.charAt(i));
            else if(s.charAt(i) == ')')
            {
                if(p.size() > 0 && p.get(p.size() - 1) == '(')
                    p.remove(p.size() - 1);
                else
                    return false;
            }
            else if(s.charAt(i) == ']')
            {
                if(p.size() > 0 && p.get(p.size() - 1) == '[')
                    p.remove(p.size() - 1);
                else
                    return false;
            }
            else if(s.charAt(i) == '}')
            {
                if(p.size() > 0 && p.get(p.size() - 1) == '{')
                    p.remove(p.size() - 1);
                else
                    return false;
            }
        }
        return (p.size() == 0) ? true : false;
    }
}