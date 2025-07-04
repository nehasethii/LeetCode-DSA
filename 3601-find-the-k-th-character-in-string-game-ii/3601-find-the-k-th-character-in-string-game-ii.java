class Solution {
    public char kthCharacter(long k, int[] operations) {
        if(k == 1)
            return 'a';
        long length = 1;
        int opType = -1;
        long newK = -1;
        for(int i = 0 ; i < operations.length ; i++){
            length *= 2;
            if(length >= k){
                newK = k - length/2;
                opType = operations[i];
                break;
            }
        }
        char ch = kthCharacter(newK , operations);
        if(opType == 0)
            return ch;
        return ch == 'z' ? 'a' : (char)(int)(ch + 1);
    }
}