class Solution {
    public long dividePlayers(int[] skill) {
        List<List<Integer>> pairs = new ArrayList<>();
        Arrays.sort(skill);
        int i = 0;
        int j = skill.length - 1;
        while(i < j)
        {
            List<Integer> temp = new ArrayList<>();
            temp.add(skill[i]);
            temp.add(skill[j]);
            pairs.add(temp);
            i++;
            j--;
        }
        int sum = pairs.get(0).get(0) + pairs.get(0).get(1);
        long chemistry = pairs.get(0).get(0) * pairs.get(0).get(1);
        if(pairs.size() != 1)
        {
            for(i = 1; i < pairs.size() ; i++)
            {
                if((pairs.get(i).get(0) + pairs.get(i).get(1)) != sum)
                    return -1;
                else
                    chemistry += pairs.get(i).get(0) * pairs.get(i).get(1);
            }
        }
        return chemistry;
    }
}