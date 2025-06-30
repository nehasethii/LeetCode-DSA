class Solution {
    public int romanToInt(String s) {
        Map<Character,Integer> romans = new HashMap<>();
        romans.put('I',1);
        romans.put('V',5);
        romans.put('X',10);
        romans.put('L',50);
        romans.put('C',100);
        romans.put('D',500);
        romans.put('M',1000);
        int n = s.length();
        int ans = 0;
        ans += romans.get(s.charAt(n-1));
        for(int i = n-2 ; i >= 0 ; i--){
            if(romans.get(s.charAt(i)) < romans.get(s.charAt(i+1)))
                ans -= romans.get(s.charAt(i));
            else
                ans += romans.get(s.charAt(i));
        }
        return ans;
    }
}