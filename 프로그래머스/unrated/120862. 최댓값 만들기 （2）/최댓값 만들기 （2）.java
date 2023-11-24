import java.util.Arrays;
import java.lang.Math;

class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        int length = numbers.length;
        int maxProduct = numbers[length - 1] * numbers[length - 2];
        int minProduct = numbers[0] * numbers[1];

        return Math.max(maxProduct, minProduct);
    }
}