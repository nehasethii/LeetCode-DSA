class Solution {
    public int[][] insert(int[][] interval, int[] newInterval) {
        List<List<Integer>> intervals = new ArrayList<>();
        for(int i = 0 ; i < interval.length ; i++){
            List<Integer> temp = new ArrayList<>();
            temp.add(interval[i][0]);
            temp.add(interval[i][1]);
            intervals.add(temp);
        }
        List<Integer> temp = new ArrayList<>();
        temp.add(newInterval[0]);
        temp.add(newInterval[1]);
        intervals.add(temp);
        return merge(intervals);
    }
    public int[][] merge(List<List<Integer>> intervals) {
        Collections.sort(intervals , (a,b) -> a.get(0) - b.get(0));
        List<List<Integer>> list = new ArrayList<>();
        int start1 = intervals.get(0).get(0);
        int end1 = intervals.get(0).get(1);
        for(int i = 1 ; i < intervals.size() ; i++){
            int start2 = intervals.get(i).get(0);
            int end2 = intervals.get(i).get(1);
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