import java.util.stream.*;
import java.util.*;

class Solution {
    public int solution(String number) {
        int sum = Arrays.stream(String.valueOf(number).split("")).mapToInt(Integer::parseInt).sum();
        return sum % 9;
    }
}