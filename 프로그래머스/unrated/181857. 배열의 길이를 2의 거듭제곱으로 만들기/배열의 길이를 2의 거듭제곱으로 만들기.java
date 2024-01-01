import java.util.*;
import java.lang.Math;

class Solution {
    public int[] solution(int[] arr) {
        int count = 0;
        for(int i = 0 ; i <11; i++) {
            if(arr.length <= Math.pow(2,i)) {
                count = i;
                break;
            }
        }
        int[] answer =  Arrays.copyOfRange(arr, 0, (int)(Math.pow(2,count)));
        return answer;
    }
}