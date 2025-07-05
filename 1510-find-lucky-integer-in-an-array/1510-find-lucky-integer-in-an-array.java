class Solution {
    public int findLucky(int[] arr) {
        Map<Integer,Integer> freq = new HashMap<>();
        for(int i = 0 ; i < arr.length ; i++){
            freq.put(arr[i],freq.getOrDefault(arr[i],0) + 1);
        }
        int max = -1;
        for(Map.Entry<Integer,Integer> entry : freq.entrySet()){
            if(entry.getKey() == entry.getValue()){
                max = Math.max(max,entry.getValue());
            }
        }
        return max;
    }
}