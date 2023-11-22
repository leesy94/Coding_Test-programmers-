class Solution {
    public int solution(int num1, int num2) {
        int answer = 0;
        float answer2 = (float)num1/(float)num2;
        answer = (int)(answer2 * 1000);
        return answer;
    }
}