import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        String[] answer = my_string.split("\\s+"); // \\s+는 하나 이상의 공백을 의미합니다.
        return Arrays.stream(answer)
                     .filter(str -> !str.isEmpty())
                     .toArray(String[]::new);
    }
}