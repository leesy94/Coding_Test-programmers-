class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        int dc = n / 10;
        if(dc > 0) {
            k -= dc;
        }
        answer = 12000*n + k*2000;
        return answer;
    }
}