class Solution {
    public int solution(int n) {
        int answer = 2;
        /*int num = 1;
        for(int i = 1 ; i < 1000 ; i ++) {
            if(i * i == n) {
                answer = 1;
                break;
            }else {
                answer = 2;
            }
        }*/
        int sqrt = (int) Math.sqrt(n);
        if(sqrt * sqrt == n) {
            answer = 1;
        }
        return answer;
    }
}