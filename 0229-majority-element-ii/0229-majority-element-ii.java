class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        int c1 = 0 , c2 = 0 , v1 = 0 , v2 = 0;
        for(int i = 0 ; i < n ; i++){
            if(v1 > 0 && c1 == nums[i]){
                v1++;
            }
            else if(v2 > 0 && c2 == nums[i]){
                v2++;
            }
            else if(v1 == 0){
                c1 = nums[i];
                v1++;
            }
            else if(v2 == 0){
                c2 = nums[i];
                v2++;
            }
            else{
                v1--;
                v2--;
            }
        }
        v1 = 0;
        v2 = 0;
        for(int i = 0 ; i < n ; i++){
            if(nums[i] == c1){
                v1++;
            }
            if(nums[i] == c2){
                v2++;
            }
        }
        List<Integer> ans = new ArrayList();
        if(v1 > n/3){
            ans.add(c1);
        }
        if(c1 != c2 && v2 > n/3){
            ans.add(c2);
        }
        return ans;
    }
}