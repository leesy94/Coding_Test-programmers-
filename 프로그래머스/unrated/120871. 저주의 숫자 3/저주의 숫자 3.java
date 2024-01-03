class Solution {
    public int solution(int n) {
        int answer = 0; 
        int count = 0;
        for(int i = 0 ; i < n ; i++) { 
            answer++;
            while(answer % 3 == 0 || String.valueOf(answer).contains("3")) {
                answer++;    
                //System.out.println(answer+"/"+count);
            }
            /*if(answer % 3 == 0 || String.valueOf(answer).contains("3")) {
                System.out.println(answer+"/"+count);
                answer++;                
            }*/
            count++;
            //System.out.println(answer+"/"+count);
        }
        return answer;
    }
}