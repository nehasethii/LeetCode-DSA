class Solution {
    public int findComplement(int num) {
        String binary = Integer.toBinaryString(num);
        StringBuilder bin = new StringBuilder();
        for(int i = 0 ; i < binary.length() ; i++)
        {
            if(binary.charAt(i) == '0')
                bin.append(1);
            else
                bin.append(0);
        } 
        int complement = Integer.parseInt(bin.toString(),2);
        return complement;
    }
}