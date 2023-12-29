import java.util.*;
import java.util.stream.*;
class Solution {
    public int solution(String my_string) {
        int answer = 0;
        my_string = my_string.replaceAll("[^\\d]", "x");
        String[] str = my_string.split("x");
        for(int i = 0; i < str.length; i++) {
            if (str[i] != null && !str[i].equals("")) {
                answer += Integer.parseInt(str[i]);
                //System.out.println(str[i]);
            }
            //System.out.println(str[i]);
        }
        return answer;
    }
}