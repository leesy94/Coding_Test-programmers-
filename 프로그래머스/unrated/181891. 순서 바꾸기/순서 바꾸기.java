import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list, int n) {
        int nl = num_list.length;
        int[] answer = new int[nl];
        int n2 = 0;
        for(int i = 0 ; i < nl; i++) {
            
            if(n < nl){
                answer[i] = num_list[n];
            }else {
                answer[i] = num_list[n2];
                n2++;
                System.out.println(n2);
            }
            n++;
            
             
        }
        return answer;
    }
}