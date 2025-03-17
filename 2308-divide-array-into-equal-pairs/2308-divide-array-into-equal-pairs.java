class Solution {
    public boolean divideArray(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        if(map.size() > nums.length / 2)
            return false;
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue() % 2 != 0)
                return false;
        }
        return true;
    }
}