class Solution {
    public boolean backspaceCompare(String s, String t) {
        StringBuilder finalS = new StringBuilder();
        StringBuilder finalT = new StringBuilder();
        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i) == '#'){
                if(finalS.length() != 0){
                    finalS.deleteCharAt(finalS.length() - 1);
                }
                continue;
            }
            finalS.append(s.charAt(i));
        }
        for(int i = 0 ; i < t.length() ; i++){
            if(t.charAt(i) == '#'){
                if(finalT.length() != 0){
                    finalT.deleteCharAt(finalT.length() - 1);
                }
                continue;
            }
            finalT.append(t.charAt(i));
        }
        if(finalS.length() != finalT.length()){
            return false;
        }
        for(int i = 0 ; i < finalS.length() ; i++){
            if(finalS.charAt(i) != finalT.charAt(i)){
                return false;
            }
        }
        return true;
    }
}