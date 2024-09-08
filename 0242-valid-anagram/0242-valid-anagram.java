class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
            return false;
        HashMap<Character,Integer> count1 = new HashMap<>();
        for(char c : s.toCharArray())
        {
            count1.put(c,count1.getOrDefault(c,0) + 1);
        }
        HashMap<Character,Integer> count2 = new HashMap<>();
        for(char c : t.toCharArray())
        {
            count2.put(c,count2.getOrDefault(c,0) + 1);
        }
        if(count1.equals(count2))
            return true;
        else
            return false;
        
    }
}