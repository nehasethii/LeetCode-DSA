class Solution {
    public int compareVersion(String version1, String version2) {
        int i = 0 , j = 0;
        int num1 = 0 , num2 = 0;
        while(i < version1.length() && j < version2.length()){
            num1 = 0;
            while(i < version1.length() && version1.charAt(i) != '.'){
                num1 = num1 * 10 + (version1.charAt(i) - '0');
                i++;
            }
            num2 = 0;
            while(j < version2.length() && version2.charAt(j) != '.'){
                num2 = num2 * 10 + (version2.charAt(j) - '0');
                j++;
            }
            if(num1 < num2){
                return -1;
            }
            else if(num1 > num2){
                return 1;
            }
            i++;
            j++;
        }
        if(num1 < num2){
            return -1;
        }
        else if(num1 > num2){
            return 1;
        }
        while(i < version1.length()){
            if(version1.charAt(i) != '.' && version1.charAt(i) != '0'){
                return 1;
            }
            i++;
        }
        while(j < version2.length()){
            if(version2.charAt(j) != '.' && version2.charAt(j) != '0'){
                return -1;
            }
            j++;
        }
        return 0;
    }
}