class Solution {
    public int solution(int n) {
        int answer = 0;
        int result = 1;        
        /*while(count <= 10){  
            int result = 1;
            for(int i = 1; i <= count; i++) {     
                result = result*i;
                if(result == n) {
                    answer = i;
                    break;
                }else {
                    count++;
                }
            }
        }*/
        for(int i = 1; i < 11 ; i++) {
            result = result * i ;
            //System.out.println(result);
            if(result == n) {
                answer = i;
               break; 
            }
            if(result > n) {
               answer = i -1;
               break; 
            }
            
        }
        
        return answer;
    }
}