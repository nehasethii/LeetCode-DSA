class Solution {
    public boolean lemonadeChange(int[] bills) {
        int[] change = new int[3];
        for(int i = 0 ; i < bills.length ; i++)
        {
            if(bills[i] == 5)
            {
                change[0]++;
            }
            else if(bills[i] == 10)
            {
                if(change[0] >= 1)
                {
                    change[0]--;
                    change[1]++;
                }
                else
                {
                    return false;
                }
            }
            else if(bills[i] == 20)
            {
                if((change[1] >= 1) && (change[0] >= 1))
                {
                    change[1]--;
                    change[0]--;
                    change[2]++;
                }
                else if((change[0] >= 3))
                {
                    change[0] -= 3;
                    change[2]++;
                }
                else
                {
                    return false;
                }
            }
        }
        return true;
    }
}