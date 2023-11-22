import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for(int a : numbers) {
            list.add(a);
        }
        Collections.sort(list);
        Collections.reverse(list);
        answer = list.get(0) * list.get(1);
        
        return answer;
    }
}