import java.util.*;
class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        int ml = 0;
        if(my_string.length() % m == 0) {
            ml = my_string.length() / m ;
        }else {
            ml = (my_string.length() / m) + 1 ;
        }
        for(int i = 0; i < ml ;i++){
            answer += my_string.substring(m*i+c-1,m*i+c);
        }
    
        return answer;
    }
}