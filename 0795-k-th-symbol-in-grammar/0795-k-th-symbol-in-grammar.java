class Solution {
    public int kthGrammar(int n, int k) {
        if(n == 1 || k == 1)
            return 0;
        int length = 1 << (n-1);
        int mid = length/2 ;
        int num = -1;
        if(k <= mid){
            num = kthGrammar(n-1,k);
        }
        else{
            num = kthGrammar(n-1,k-mid);
            num = (num == 0) ? 1 : 0;
        }
        return num;
    }
}