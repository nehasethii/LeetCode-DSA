class Solution {
    public int kthDigit(long k) {
        int l = 1;
        //finding the suitable range block 
        // k > 9L * Math.pow(10,l-1) * l means range m no.s kmm h k ki value jyada h to next digit range m aao like 1 se 2 2 se 3 or k me se prev range ghta do . curr range m k ki valuye kya hogi wo pta lgg jayegi 
        // and l == no of digits in the numbers of this range
        while(9L * Math.pow(10,l-1) * l < k){
            k -= 9L * Math.pow(10,l-1) * l;
            l += 1;
        }
        k -= 1; // 0-based indexing;
        //Math.pow(10,l-1) is nasically the first no of this l numbered range and d/l is how many whole numbers we skipped and from what no. should the ans exacty from
        long d = (long)(Math.pow(10,l-1) + k/l);
        k = k % l; // digit of the no.
        int res = String.valueOf(d).charAt((int)k) - '0';
        return (k < l-1) || (d/10 % 2 == 0) ? res : 9 - res;
    }
}