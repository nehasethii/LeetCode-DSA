class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<List<Integer>> intervalsList = new ArrayList<>();
        boolean inserted = false;
        for(int i = 0 ; i < intervals.length ; i++){
            int start = intervals[i][0];
            if(!inserted && start >= newInterval[0]){
                List<Integer> temp = new ArrayList<>();
                temp.add(newInterval[0]);
                temp.add(newInterval[1]);
                intervalsList.add(temp);
                inserted = true;
            }
            List<Integer> temp = new ArrayList<>();
            temp.add(intervals[i][0]);
            temp.add(intervals[i][1]);
            intervalsList.add(temp);
        }
        if(!inserted){
            List<Integer> temp = new ArrayList<>();
            temp.add(newInterval[0]);
            temp.add(newInterval[1]);
            intervalsList.add(temp);
        }
        return merge(intervalsList);
    }
    public int[][] merge(List<List<Integer>> intervals){
        List<List<Integer>> list = new ArrayList<>();
        int start1 = intervals.get(0).get(0);
        int end1 = intervals.get(0).get(1);
        for(int i = 1 ; i < intervals.size() ; i++){
            int start2 = intervals.get(i).get(0);
            int end2 = intervals.get(i).get(1);
            if(end1 >= start2){
                end1 = Math.max(end1,end2);
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
        int[][] ans = new int[list.size()][2];
        for(int i = 0 ; i < list.size() ; i++){
            ans[i][0] = list.get(i).get(0);
            ans[i][1] = list.get(i).get(1);
        }
        return ans;
    }
}