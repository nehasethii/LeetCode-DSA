import java.lang.*;
class Solution {
    public int maxDistance(List<List<Integer>> arrays) {
        int minimum = arrays.get(0).get(0);
        int maximum = arrays.get(0).get(arrays.get(0).size() - 1);
        int maxDistance = 0;
        for(int i = 1 ; i < arrays.size() ; i++)
        {
            maxDistance = Math.max(maxDistance,Math.max(
                Math.abs(arrays.get(i).get(arrays.get(i).size() - 1) - minimum),
                Math.abs(arrays.get(i).get(0) - maximum)));

            minimum = Math.min(minimum,arrays.get(i).get(0));
            maximum = Math.max(maximum,arrays.get(i).get(arrays.get(i).size() - 1));
        }

        return maxDistance;
    }
}