import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.lang.Math;

class Solution {
    public int[] solution(int[] answers) {
        int[] student01 = {1, 2, 3, 4, 5};
        int[] student02 = {2, 1, 2, 3, 2, 4, 2, 5,};
        int[] student03 = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        int[] collect = new int[3];
        
        for(int i = 0 ; i < answers.length ; i ++) {
            if(answers[i] == student01[i%5]) {
                collect[0]++;
            }
            if(answers[i] == student02[i%8]) {
                collect[1]++;
            }
            if(answers[i] == student03[i%10]) {
                collect[2]++;
            }
        }
        
        //System.out.println(Arrays.toString(collect));
        
        int maxScore = Math.max(collect[0], Math.max(collect[1], collect[2]));
        
         List<Integer> list = new ArrayList<>();
        
        for(int i = 0 ; i < 3; i++) {
            if(maxScore == collect[i]) list.add(i+1);
        }
        
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer; 
    }
}