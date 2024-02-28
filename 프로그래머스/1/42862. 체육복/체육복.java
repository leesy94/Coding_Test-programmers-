import java.util.Arrays;
import java.util.ArrayList;
import java.util.stream.IntStream;
import java.util.Collections;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        ArrayList<Integer> lostArr = new ArrayList<>();
        for(int num : lost) {
            if(!IntStream.of(reserve).anyMatch(x -> x == num)) {
                lostArr.add(num);    
            }
        }
        Collections.sort(lostArr);
        ArrayList<Integer> reserveArr = new ArrayList<>();
        for(int num : reserve) {
            if(!IntStream.of(lost).anyMatch(x -> x == num)) {
                reserveArr.add(num);    
            }
        }
        for(int num : lostArr) {
            int prev = num - 1;
            int next = num + 1;
            if(reserveArr.contains(prev)) {
                reserveArr.remove(Integer.valueOf(prev));
                answer++;
            }
            else if(reserveArr.contains(next)) {
                reserveArr.remove(Integer.valueOf(next));
                answer++;
            }
        }
        return answer + n - lostArr.size();
    }
}