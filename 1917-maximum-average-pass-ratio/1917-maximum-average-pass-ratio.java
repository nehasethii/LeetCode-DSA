class Solution {
    public double maxAverageRatio(int[][] classes, int extraStudents) {
        int n = classes.length;
        Comparator<int[]> comp = new Comparator<int[]>(){
            public int compare(int[] a , int[] b){
                double gainA = (double)(a[0]+1)/(a[1]+1) - (double)a[0]/a[1];
                double gainB = (double)(b[0]+1)/(b[1]+1) - (double)b[0]/b[1];
                if(gainA > gainB) return -1;
                else if(gainB > gainA) return 1;
                return 0;
            }
        };
        PriorityQueue<int[]> pq = new PriorityQueue<>(comp);
        for(int[] cls : classes){
            pq.offer(cls);
        }
        for(int i = 0 ; i < extraStudents ; i++){
            int[] best = pq.poll();
            best[0]++;
            best[1]++;
            pq.offer(best);
        }
        double sum = 0;
        for(int[] cls : pq){
            sum += (double)cls[0]/cls[1];
        }
        return sum/n;
    }
}