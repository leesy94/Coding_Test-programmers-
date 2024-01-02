class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        for(int i = 0 ; i < k ; i++) {
            if(i*2 >= numbers.length) {
                answer = numbers[(i*2)%numbers.length];
            }else {
                answer = numbers[i*2];
            }
        }
        return answer;
    }
}