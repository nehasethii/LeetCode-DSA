class Solution {
    public int countPrimes(int n) {
        boolean[] isPrime = new boolean[n];
        Arrays.fill(isPrime,true); 
        for(int i = 2 ; i * i < n ; i++){
            if(isPrime[i]){
                for(int j = 2 ; j * j < i ; j++){
                    if(i % j == 0){
                        isPrime[i] = false;
                    }
                }
            }
            if(isPrime[i]){
                for(int j = i + i ; j < n ; j += i){
                    isPrime[j] = false;
                }
            }
        }
        int count = 0;
        for(int i = 2 ; i < n ; i++){
            if(isPrime[i])
                count++;
        }
        return count;
    }
}