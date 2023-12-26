import java.util.stream.*;
import java.util.Arrays;
class Solution {
    public String[] solution(String myString) {
        String[] answer = Arrays.stream(myString.split("x"))
                                .filter(str -> !str.isEmpty())
                                .sorted()
                                .toArray(String[]::new);
        
        
        return answer;
    }
}