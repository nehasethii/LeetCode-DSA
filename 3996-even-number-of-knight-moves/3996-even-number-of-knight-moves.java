class Solution {
    public boolean canReach(int[] start, int[] target) {
        int startParity = (start[0] + start[1]) % 2;
        int targetParity = (target[0] + target[1]) % 2;
        return startParity == targetParity;
    }
}