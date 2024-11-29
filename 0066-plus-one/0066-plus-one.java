class Solution {
    public int[] plusOne(int[] arr) {
        List<Integer> num = new ArrayList<Integer>();
        int n = arr.length;
        if (n == 0) {
            return new int[]{1};
        }
        for (int i = 0; i < n; i++)
            num.add(arr[i]);
        n = num.size();
        int carry = 1;
        for (int j = n - 1; j >= 0; j--) {
            if (num.get(j) < 9) {
                num.set(j, num.get(j) + 1);
                carry = 0;
                break;
            } 
            else
            {
                num.set(j, 0);
                carry = 1;
            }
        }
        if(carry == 1)
            num.add(0, 1);
        int[] result = new int[num.size()];
        for(int i = 0 ; i < num.size() ; i++)
            result[i] = num.get(i);
        return result;
    }
}