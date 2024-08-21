class Solution {
        public static int countSeniors(String[] details) {
            int count = 0;
            for(String s : details)
            {
                String arr = s.substring(11,13);
                if(Integer.valueOf(arr) > 60)
                {
                    count++;
                }
            }
            return count;
        }

        public static void main(String[] args)
        {
            String[] details = {"7868190130M7522","5303914400F9211","9273338290F4010"};
            int numOfSeniors = countSeniors(details);
            System.out.println(numOfSeniors);
        }
}
