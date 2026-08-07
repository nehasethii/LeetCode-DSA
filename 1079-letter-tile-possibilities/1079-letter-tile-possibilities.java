class Solution {
    List<String> ans = new ArrayList<>();
    public int numTilePossibilities(String tiles) {
        char[] ch = tiles.toCharArray();
        Arrays.sort(ch);
        tiles = new String(ch);
        StringBuilder sb = new StringBuilder();
        boolean[] visited = new boolean[tiles.length()];
        countTilePossibilities(tiles,sb,visited);
        return ans.size();
    }
    public void countTilePossibilities(String tiles, StringBuilder sb, 
    boolean[] visited){
        if(sb.length() != 0){
            ans.add(sb.toString());
        }
        for(int i = 0 ; i < tiles.length() ; i++){
            if(i > 0 && tiles.charAt(i) == tiles.charAt(i-1) && !visited[i-1]){
                continue;
            }
            if(!visited[i]){
                //countTilePossibilities(tiles,sb,visited);
                visited[i] = true;
                sb.append(tiles.charAt(i));
                countTilePossibilities(tiles,sb,visited);
                sb.deleteCharAt(sb.length() - 1);
                visited[i] = false;
            }
        }
    }
}

// "A", "B", "AA", "AB", "BA", "AAB", "ABA", "BAA".
//i = 0  "B",  "AB", "BA", , "ABA", "BAA".
//i = 1  "B",  "BA", "BAA".
//i = 2  ALL VISITED