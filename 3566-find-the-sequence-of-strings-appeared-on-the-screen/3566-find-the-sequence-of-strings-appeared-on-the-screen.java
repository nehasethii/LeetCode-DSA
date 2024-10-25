class Solution {
    public List<String> stringSequence(String target) {
        List<String> set = new ArrayList<>();
        StringBuilder current = new StringBuilder();
        current.append("a");
        set.add(current.toString());
        for(int i = 0 ; i < target.length() ; i++)
        {
            if(i > 0)
            {
                current.append("a");
                set.add(current.toString());
            }
            while(current.charAt(i) < target.charAt(i))
            {
                current.replace(i,i+1,String.valueOf((char)(current.charAt(i) + 1)));
                set.add(current.toString());
            }
        }
        return set;
    }
}