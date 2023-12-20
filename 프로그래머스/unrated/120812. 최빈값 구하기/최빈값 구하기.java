import java.util.*;

class Solution {
    public int solution(int[] array) {
        /*int min = Arrays.stream(array).min().getAsInt();
        int count = 0;
        for(int i : array) {
            if(i == min) {
                count++;    
            }
        }
        return count > 1 ? -1 : min;*/
        int max = Arrays.stream(array).max().getAsInt();
        int[] arr = new int[max+1];
        for(int i =0;i<array.length;i++){
            arr[array[i]]++;
        }
        System.out.println(Arrays.toString(arr));
        int answer = -1;
        int count = 0;
        int arrmax = Arrays.stream(arr).max().getAsInt();
        for(int i = 0 ; i < arr.length; i++) {
            if(arrmax == arr[i]) {                
                count++;
                answer = i;
            }
        }
        return count == 1 ? answer : -1;
    }
}