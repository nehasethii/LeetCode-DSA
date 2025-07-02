class Solution {
    public String convert(String s, int numRows) {
        int n = s.length();
        if(numRows == 1)
            return s;
        String[] strs = new String[numRows];
        Arrays.fill(strs,"");
        int idx = 0;
        int i = 0;
        while(i < n){
            for(int j = 0 ; j < numRows - 1 ; j++){
                if(i < n)
                    strs[idx++] += s.charAt(i);
                i++;
            }
            for(int j = 0 ; j < numRows - 1 ; j++){
                if(i < n)
                    strs[idx--] += s.charAt(i);
                i++;
            }
        }
        String result = "";
        for(i = 0 ; i < strs.length ; i++){
            result += strs[i];
        }
        return result;
    }
}