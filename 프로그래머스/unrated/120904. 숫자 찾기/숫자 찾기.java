import java.util.Arrays;

class Solution {
    public int solution(int num, int k) {
        int answer = -1;
        int[] arr = Arrays.stream(String.valueOf(num).split("")).mapToInt(Integer::parseInt).toArray();;
        //System.out.println(arr);
        for(int i = 0 ; i < arr.length;i++) {
            if(arr[i] == k) {
                answer = i+1;
                break;
            }
        }
        return answer;
    }
}