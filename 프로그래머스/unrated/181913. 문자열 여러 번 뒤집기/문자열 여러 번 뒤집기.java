class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = "";
         /*StringBuffer str = new StringBuffer(my_string);
         str= sb.reverse().toString();*/
        for(int i = 0 ; i < queries.length;i++) {
            String str1 = "";
            String str3 = "";
            if(queries[i][0] > 0) {
                str1 = my_string.substring(0,queries[i][0]);
            }
            String str2 = my_string.substring(queries[i][0],queries[i][1]+1);
            StringBuilder str = new StringBuilder(str2).reverse();
            if(my_string.length() > queries[i][1]+1) {
                str3 = my_string.substring(queries[i][1]+1,my_string.length());
            }            
            my_string = str1 + str + str3;
        }
        return my_string;
    }
}