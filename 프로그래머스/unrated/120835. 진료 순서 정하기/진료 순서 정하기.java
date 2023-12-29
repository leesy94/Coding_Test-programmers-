import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        
        int[] emergency_copy = Arrays.stream(emergency).boxed()
                .sorted(Comparator.reverseOrder())
                .mapToInt(Integer::intValue)
            .toArray();

        for (int i = 0; i < emergency.length; i++) {
            for (int j = 0; j < emergency.length; j++) {
                if (emergency[i] == emergency_copy[j]) {
                    answer[i] = j + 1;
                    //break;
                }
            }
        }
        return answer;
    }
}