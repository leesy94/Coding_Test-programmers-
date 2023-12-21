import java.util.stream.*;
class Solution {
    public int solution(int order) {
      return (int)String.valueOf(order).chars()
                 .map(Character::getNumericValue)
                .filter(n -> n == 3 || n == 6 || n == 9)
                .count();
    }
}