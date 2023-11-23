class Solution
{
    public int solution(int n, int a, int b){
        /*int answer = 1;
        while(Math.abs(b - a) != 1) { 
            a = a % 2 == 0 ? a/2 : a/2 +1 ;
            b = b % 2 == 0 ? b/2 : b/2 +1 ;
            answer++;
        }
        //System.out.println(answer);
        return answer;*/
        
        int round = 0;

        while (a != b) {
            a = (a + 1) / 2;
            b = (b + 1) / 2;
            round++;
        }

        return round;
    }
}