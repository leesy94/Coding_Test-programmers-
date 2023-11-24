import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length];
        /*return Arrays.stream(arr)
                    .filter(i -> { 
                        if(i%2==0 && i>50) {i = i/2;}
                         else if(i%2!=0 && i<50) {i = i*2;} })
                    .toArray();*/
        for(int i = 0 ; i < arr.length; i++) {
            if(arr[i]%2==0 && arr[i]>=50) {
                answer[i] = arr[i]/2;
            }else if(arr[i]%2!=0 && arr[i] < 50) {
                answer[i] = arr[i]*2;
            }else {
                answer[i] = arr[i];
            }
        }
        return answer;
    }
}