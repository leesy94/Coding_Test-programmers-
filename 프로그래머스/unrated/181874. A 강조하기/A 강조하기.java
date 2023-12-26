import java.util.stream.*;

class Solution {
    public String solution(String myString) {
        String answer = myString.chars()
                        .mapToObj(a -> String.valueOf((char) a))
                        .map(String::toLowerCase)
                        .collect(Collectors.joining());
        
        return answer.replaceAll("a", "A");
    }
}