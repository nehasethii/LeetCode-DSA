class RecentCounter {
    Queue<Integer> q;
    public RecentCounter() {
        q = new ArrayDeque<>();
    }
    
    public int ping(int t) {
        q.offer(t);
        int lowerBound = t - 3000;
        while(!q.isEmpty() && q.peek() < lowerBound){
            q.poll();
        }
        return q.size();
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */