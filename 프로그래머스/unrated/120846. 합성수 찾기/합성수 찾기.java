import java.util.stream.*;

class Solution {
    public int solution(int n) {
        return (int) IntStream.rangeClosed(4, n)
            .filter(i -> IntStream.rangeClosed(1, i).filter(j -> i % j == 0).count() >= 3)
            .count();
        
    }
}