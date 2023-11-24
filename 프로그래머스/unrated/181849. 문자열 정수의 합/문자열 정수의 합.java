import java.util.Arrays;

class Solution {
    public int solution(String num_str) {
        String arr[] = num_str.split("");
        return Arrays.stream(arr).mapToInt(Integer::parseInt).sum();
    }
}