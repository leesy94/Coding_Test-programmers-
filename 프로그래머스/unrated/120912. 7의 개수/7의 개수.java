import java.util.*;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            String[] digits = String.valueOf(array[i]).split("");
            for (String digit : digits) {
                if(Integer.parseInt(digit) == 7){
                    answer++;
                }
            }
        }
        return answer;
    }
}