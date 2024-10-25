class Solution {
    public List<Integer> stableMountains(int[] height, int threshold) {
        List<Integer> stable = new ArrayList<>();
        for(int i = 1 ; i < height.length ; i++)
        {
            if(height[i - 1] > threshold)
                stable.add(i);
        }
        return stable;
    }
}