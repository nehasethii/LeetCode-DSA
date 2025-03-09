class Solution {
    public int numberOfAlternatingGroups(int[] colors, int k) {
        int left = 0 , right = 0;
        int count = 0;
        int n = colors.length;
        int[] newColors = new int[n+k-1];
        for(int i = 0 ; i < n ; i++){
            newColors[i] = colors[i];
        }
        for(int i = n ; i < newColors.length ; i++){
            newColors[i] = colors[i%n];
        }
        n = newColors.length;
        while(right < n-1){
            if(newColors[right + 1] != newColors[right]){
                right++;
                if((right - left + 1) == k){
                    count++;
                    left++;
                }
            }
            else{
                left = ++right;
            }
        }
        return count;
    }
}