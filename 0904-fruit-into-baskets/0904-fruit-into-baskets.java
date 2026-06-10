class Solution {
    public int totalFruit(int[] fruits) {
        int ans = Integer.MIN_VALUE;
        Map<Integer,Integer> map = new HashMap<>();
        int low = 0 , high = 0;
        int n = fruits.length;
        for(high = 0 ; high < n ; high++){
            map.put(fruits[high],map.getOrDefault(fruits[high],0) + 1);
            while(map.size() > 2){
                map.put(fruits[low],map.getOrDefault(fruits[low],0) - 1);
                if(map.get(fruits[low]) == 0){
                    map.remove(fruits[low]);
                }
                low++;
            }
            int len = high - low + 1;
            ans = Math.max(ans,len);
        }
        //return (ans == Integer.MIN_VALUE) ? -1 : ans;
        return ans;
    }
}