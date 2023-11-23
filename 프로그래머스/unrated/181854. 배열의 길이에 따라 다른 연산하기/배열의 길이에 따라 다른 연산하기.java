import java.util.*;

class Solution {
    public int[] solution(int[] arr, int n) {
        int al = arr.length;
        int[] answer = Arrays.copyOf(arr,al);     
        if(al % 2 == 0) {
            for(int i = 0 ; i < al;i++) {
                if(i % 2 != 0) {
                    answer[i] += n;
                }
            }
        }else {
            for(int i = 0 ; i < al;i++) {
                if(i % 2 == 0) {
                    answer[i] += n;
                }
            }
        }
        return answer;
    }
}