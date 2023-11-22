import java.util.ArrayList;

class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        /*int[] answer = new int[numbers.length-(num2-num1)];
        
        int count = 0;
        for(int i = 0 ; i < numbers.length;i++){
            if(i >= num1 && i <= num2) {
                answer[count] = numbers[i];
                count++;
            }
        }*/
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = num1 ; i <= num2; i++) {
            list.add(numbers[i]);
        }
        int[] answer = new int[list.size()];
        int size = 0;
        for(int temp : list){ 
            answer[size++] = temp;
        }
        return answer;
    }
}