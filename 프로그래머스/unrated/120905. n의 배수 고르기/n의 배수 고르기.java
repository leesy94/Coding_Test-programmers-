import java.util.Arrays;
import java.util.stream.Stream;

class Solution {
    public int[] solution(int n, int[] numlist) {        
        return Arrays.stream(numlist)
            .filter(num -> num % n == 0 )
            .toArray();
    }
}