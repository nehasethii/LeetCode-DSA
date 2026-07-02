class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals , (a,b) -> a[0] - b[0]);
        List<List<Integer>> list = new ArrayList<>();
        int start1 = intervals[0][0];
        int end1 = intervals[0][1];
        for(int i = 1 ; i < intervals.length ; i++){
            int start2 = intervals[i][0];
            int end2 = intervals[i][1];
            if(end1 >= start2){ //merge
                start1 = start1;
                end1 = Math.max(end1 , end2);
                continue;
            }
            List<Integer> temp = new ArrayList<>();
            temp.add(start1);
            temp.add(end1);
            list.add(temp);
            start1 = start2;
            end1 = end2;
        }
        List<Integer> temp = new ArrayList<>();
        temp.add(start1);
        temp.add(end1);
        list.add(temp);

        int n = list.size();
        int m = list.get(0).size();
        int[][] ans = new int[n][m];
        for(int i = 0 ; i < n ; i++){
            ans[i][0] = list.get(i).get(0);
            ans[i][1] = list.get(i).get(1);
        } 
        return ans;
    }
}