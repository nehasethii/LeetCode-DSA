class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> q = new ArrayDeque<>();
        int idx = 0;
        for(int i = 0 ; i < students.length ; i++){
            q.offer(students[i]);
        }
        int count = 0;
        while(idx < sandwiches.length){
            if(q.peek() == sandwiches[idx]){
                q.poll();
                idx++;
                count = 0;
            }
            else{
                int student = q.poll();
                q.offer(student);
                count++;
            }
            if(count == q.size()){
                break;
            }
        }
        return q.size();
    }
}