import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        for(int a : sides){
            arr.add(a);
        }
        Collections.sort(arr);
        
        if(arr.get(2) >= arr.get(0) + arr.get(1)) 
            answer = 2;
        else 
            answer = 1;
        return answer;
    }
}