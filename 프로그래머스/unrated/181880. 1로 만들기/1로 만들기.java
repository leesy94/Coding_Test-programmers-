class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        for(int i = 0; i < num_list.length;i++) {
            int result = num_list[i];
            int count = 0;
            while(result != 1) {
                if(result % 2 == 0) {
                    result = result/2;
                }else {
                    result = (result-1)/2;
                }
                count++;
            }
            answer += count;
        }
        return answer;
    }
}