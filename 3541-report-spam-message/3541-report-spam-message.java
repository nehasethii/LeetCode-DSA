class Solution {
    public boolean reportSpam(String[] message, String[] bannedWords) {
        int count = 0;
        Map<String,Integer> banned = new HashMap<String,Integer>();
        for(String str : bannedWords)
        {
            banned.put(str,banned.getOrDefault(str,0)+1);
        }
        for(String s : message)
        {
            if(banned.getOrDefault(s,0) != 0)
                count++;
        }
        return (count >= 2);

    }
}