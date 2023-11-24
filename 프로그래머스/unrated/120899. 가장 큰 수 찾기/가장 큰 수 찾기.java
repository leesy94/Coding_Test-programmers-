import java.util.*;

class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int[2];
        OptionalInt maxOptional = Arrays.stream(array).max();
        int max = maxOptional.getAsInt();
        answer[0] = max;
        for(int i = 0 ; i < array.length;i++) {
            if(array[i] == max){
                answer[1] = i;
            }
        }
        return answer;
    }
}