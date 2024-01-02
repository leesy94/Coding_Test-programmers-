class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int max = sides[0] > sides[1] ? sides[0] : sides[1];
        int min = sides[0] > sides[1] ? sides[1] : sides[0];
        //가장 긴 변이 max인 경우
        for(int i= max-min+1 ; i <= max ; i++) {
            answer++;
        }
        //가장 긴 변이 다른 변일 경우
        for(int i = max+1 ; i < max+min ; i++) {
            answer++;
        }
        return answer;
    }
}