class Solution {
    public int[] arrayRankTransform(int[] arr) {
        if(arr.length == 0)
            return new int[]{};
        if(arr.length == 1)
            return new int[]{1}; 
        int[] temp = arr.clone();
        Arrays.sort(temp);
        Map<Integer,Integer> map = new HashMap<>();
        int rank = 1;
        map.put(temp[0],rank);
        for(int i = 1 ; i < temp.length ; i++)
        {
            if(temp[i] > temp[i-1])
                rank++;
            map.put(temp[i],rank);
        }
        for(int i = 0 ; i < arr.length ; i++)
        {
            arr[i] = map.get(arr[i]);
        }
        return arr;
    }
}