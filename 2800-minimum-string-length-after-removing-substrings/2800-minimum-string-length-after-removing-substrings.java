class Solution {
    public int minLength(String s) {
        StringBuffer str = new StringBuffer(s);
        while(str.indexOf("AB") >= 0 || str.indexOf("CD") >= 0)
        {
            if(str.indexOf("AB") >= 0)
                str.delete(str.indexOf("AB"),str.indexOf("AB") + 2);
            if(str.indexOf("CD") >= 0)
                str.delete(str.indexOf("CD"),str.indexOf("CD") + 2);
        }
        return str.length();
    }
}