class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0 ; i < intervals.length ; i++){
            int s = intervals[i][0];
            int e = intervals[i][1];
            int n = ans.size();
            if(n == 0 || s > ans.get(n-1).get(1)){
                List<Integer> temp = new ArrayList<>();
                temp.add(s);
                temp.add(e);
                ans.add(temp);
            }
            else{
                e = Math.max(e,ans.get(n-1).get(1));
                ans.get(n-1).set(1,e); 
            }
        }
        int n = ans.size();
        int[][] sol = new int[n][2];
        for(int i = 0 ; i < n ; i++){
            sol[i][0] = ans.get(i).get(0);
            sol[i][1] = ans.get(i).get(1);
        }
        return sol;
    }
}