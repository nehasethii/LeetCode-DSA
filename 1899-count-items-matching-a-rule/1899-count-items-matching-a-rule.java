class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0 ;
        for(int i = 0 ; i < items.size() ; i++)
        {
            if(ruleKey.equals("type"))
            {
                if(ruleValue.equals(items.get(i).get(0)))
                    count++;
            }
            else if(ruleKey.equals("color"))
            {
                if(ruleValue.equals(items.get(i).get(1)))
                    count++;
            }
            else if(ruleKey.equals("name"))
            {
                if(ruleValue.equals(items.get(i).get(2)))
                    count++;
            }
        }
        return count;
    }
}