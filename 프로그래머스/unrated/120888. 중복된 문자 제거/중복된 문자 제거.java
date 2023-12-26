import java.util.*;
class Solution {
    public String solution(String my_string) {
        String answer = "";
        Set<String> hs = new LinkedHashSet<String>();
        for(int i = 0 ; i < my_string.length();i++) {
            hs.add(String.valueOf(my_string.charAt(i)));
        }
        for(String str : hs) {
            answer += str;
        }
        return answer;
    }
}