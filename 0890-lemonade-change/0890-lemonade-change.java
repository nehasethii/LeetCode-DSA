class Solution {
    public boolean lemonadeChange(int[] bills) {
        int[] billsCount = new int[3];
        for(int i = 0 ; i < bills.length ; i++)
        {
            if(bills[i] == 5)
                billsCount[0]++;
            if(bills[i] == 10)
            {
                if(billsCount[0] < 1)
                    return false;
                else
                {
                    billsCount[1]++;
                    billsCount[0]--;
                }   
            }
            if(bills[i] == 20)
            {
                if((billsCount[1] < 1 || billsCount[0] < 1) && billsCount[0] < 3)
                    return false;
                else if(billsCount[1] >= 1 && billsCount[0] >= 1)
                {
                    billsCount[2]++;
                    billsCount[1]--;
                    billsCount[0]--;
                }
                else if(billsCount[0] >= 3)
                {
                    billsCount[2]++;
                    billsCount[0] -= 3;
                }
            }
        }
        return true;
    }
}