import java.util.ArrayList;

class Solution {
    public String solution(String my_string, String letter) {
        String answer = "";
        for(int i = 0 ; i < my_string.length();i++) {
            if(!letter.equals(String.valueOf(my_string.charAt(i)))) 
                answer += my_string.charAt(i)    ;        
        }
        return answer;
    }
}