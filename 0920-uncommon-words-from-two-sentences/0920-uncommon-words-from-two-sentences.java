class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        String[] str1 = s1.split(" ");
        String[] str2 = s2.split(" ");
        Map<String,Integer> oddWords = new HashMap<String,Integer>();
        for(int i = 0 ; i < str1.length ; i++)
        {
            oddWords.put(str1[i],oddWords.getOrDefault(str1[i],0) + 1);
        }
        for(int i = 0 ; i < str2.length ; i++)
        {
            oddWords.put(str2[i],oddWords.getOrDefault(str2[i],0) + 1);
        }
        List<String> ans = new ArrayList<String>();
        for(Map.Entry<String,Integer> entry : oddWords.entrySet())
        {
            if(entry.getValue() == 1)
                ans.add(entry.getKey());
        }
        String[] result = new String[ans.size()];
        for(int i = 0 ; i < ans.size() ; i++)
        {
            result[i] = ans.get(i);
        } 
        return result;
    }
}