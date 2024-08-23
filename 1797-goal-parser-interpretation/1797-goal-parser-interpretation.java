class Solution {
    public String interpret(String command) {
        StringBuilder str = new StringBuilder();
        int i = 0;
        while(i < command.length())
        {
            if(command.charAt(i) == 'G')
            {
                str.append('G');
            }
            else if(command.charAt(i) == '(')
            {
                if(command.charAt(i+1) == ')')
                {
                    str.append('o');
                    i++;
                }
                else
                {
                    str.append("al");
                    i += 2;
                }
            }
            i++;
        }
        return str.toString();
    }
}