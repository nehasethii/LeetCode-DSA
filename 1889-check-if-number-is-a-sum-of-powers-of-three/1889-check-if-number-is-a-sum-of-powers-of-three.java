class Solution {
    public boolean checkPowersOfThree(int n) {
        List<Integer> base3 = new ArrayList<>();
        while(n > 0){
            base3.add(n % 3);
            n /= 3;
        }
        for(int i = 0 ; i < base3.size() ; i++){
            if(base3.get(i) > 1)
                return false;
        }
        return true;
    }
}