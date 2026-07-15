class Solution {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        List<List<Integer>> ans = new ArrayList<>();
        int i = 0; 
        int j = 0;
        int n = firstList.length;
        int m = secondList.length;
        while(i < n && j < m){
            if(firstList[i][1] < secondList[j][1]){
                if(firstList[i][1] >= secondList[j][0]){
                    int start = Math.max(firstList[i][0] , secondList[j][0]);
                    int end = Math.min(firstList[i][1] , secondList[j][1]);
                    List<Integer> temp = new ArrayList<>();
                    temp.add(start);
                    temp.add(end);
                    ans.add(temp);
                }
                i++;
            }
            else{
                if(secondList[j][1] >= firstList[i][0]){
                    int start = Math.max(firstList[i][0] , secondList[j][0]);
                    int end = Math.min(firstList[i][1] , secondList[j][1]);
                    List<Integer> temp = new ArrayList<>();
                    temp.add(start);
                    temp.add(end);
                    ans.add(temp);
                }
                j++;
            }
        }
        int[][] intersections = new int[ans.size()][2];
        for(i = 0 ; i < ans.size() ; i++){
            intersections[i][0] = ans.get(i).get(0);
            intersections[i][1] = ans.get(i).get(1);
        }
        return intersections;
    }
}