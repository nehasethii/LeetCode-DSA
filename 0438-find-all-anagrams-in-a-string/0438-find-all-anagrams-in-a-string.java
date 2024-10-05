class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> indices = new ArrayList<>(); 
        if(s.length() < p.length())
            return indices;
        int[] sCount = new int[26];
        int[] pCount = new int[26];
        for(int i = 0 ; i < p.length() ; i++)
        {
            sCount[s.charAt(i) - 'a']++;
            pCount[p.charAt(i) - 'a']++;
        }
        int i = 0;
        for(i = 0 ; i < s.length() - p.length() ; i++)
        {
            if(isAnagram(sCount,pCount))
                indices.add(i);
            sCount[s.charAt(i) - 'a']--;
            sCount[s.charAt(i + p.length()) - 'a']++;
        }
        if(isAnagram(sCount,pCount))
            indices.add(i);
        return indices;
    }
    public static boolean isAnagram(int[] a , int[] b)
    {
        for(int i = 0 ; i < 26 ; i++)
        {
            if(a[i] != b[i])
                return false;
        }
        return true;
    }
}