import java.util.stream.*;
import java.util.Arrays;
class Solution {
    public String solution(String my_string) {
        return Arrays.stream(my_string.split(""))
            .map(String::toLowerCase)    
            .sorted()
            .collect(Collectors.joining());
    }
}