class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
            return false;
        HashMap<Character,Integer> count = new HashMap<>();
        for(char c : s.toCharArray())
        {
            count.put(c,count.getOrDefault(c,0) + 1);
        }
        for(char c : t.toCharArray())
        {
            count.put(c,count.getOrDefault(c,0) - 1);
        }
        for(int val : count.values())
        {
            if(val != 0)
                return false;
        }
        return true;
    }
}