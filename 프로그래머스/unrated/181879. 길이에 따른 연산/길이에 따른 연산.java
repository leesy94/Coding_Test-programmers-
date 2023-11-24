import java.util.Arrays;
class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        return num_list.length > 10 ? 
                Arrays.stream(num_list).sum() : 
                Arrays.stream(num_list).reduce((i, j) -> i * j).getAsInt();
    }
}