import java.util.*;

class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        int sum1 = Arrays.stream(arr1).sum();
        int sum2 = Arrays.stream(arr2).sum();
        int len1 = arr1.length;
        int len2 = arr2.length;
        if(len1 == len2) {
            if(sum1 != sum2) {
                if(sum2 > sum1) 
                    answer = -1;
                else 
                    answer = 1;
            }
        }else {
            if(len2 > len1)
                answer = -1;
            else 
                answer = 1;
        }
        return answer;
    }
}