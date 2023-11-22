import java.util.*;

class Solution {
    public int solution(String my_string) {
        String[] list = my_string.split("");
        int answer = Arrays.stream(list)
            .filter(s -> isNumeric(s))
            .mapToInt(Integer::parseInt)
            .sum();
        return answer;
    }
    
    private boolean isNumeric(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}