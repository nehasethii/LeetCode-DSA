class Solution {
    public int minSwapsCouples(int[] row) {
        int count = 0;
        for(int i = 0 ; i < row.length ; i+=2)
        {
            int partner = (row[i] % 2 == 0) ? row[i] + 1 : row[i] - 1;
            if(row[i+1] == partner)
                continue;
            else
            {
                for(int j = i + 1 ; j < row.length ; j++)
                {
                    if(row[j] == partner)
                    {
                        int temp = row[j];
                        row[j] = row[i+1];
                        row[i+1] = temp;
                        count++;
                        break;
                    }
                }
            }
        }
        return count;
    }
}