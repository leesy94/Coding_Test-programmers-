import java.util.*;
import static java.lang.Math.abs;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        Arrays.sort(array);
        for(int i =0;i < array.length;i++) {
            int md = (array.length-1) / 2;
            answer = array[md];
        }
        return answer;
    }
}