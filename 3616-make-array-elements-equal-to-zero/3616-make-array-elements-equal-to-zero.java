class Solution {
    public int countValidSelections(int[] arr) {
        int count = 0;
        List<Integer> indices = new ArrayList<>();
        for (int k = 0; k < arr.length; k++) {
            if (arr[k] == 0)
                indices.add(k);
        }
        for (int i = 0; i < indices.size(); i++) {
            int curr = indices.get(i);
            int sum1 = 0;
            for (int k = 0; k < curr; k++) {
                sum1 += arr[k];
            }
            int sum2 = 0;
            for (int k = curr; k < arr.length; k++) {
                sum2 += arr[k];
            }
            if (sum1 == sum2)
                count += 2;
            else if (Math.abs(sum1 - sum2) == 1)
                count++;
        }
        return count;
    }
}