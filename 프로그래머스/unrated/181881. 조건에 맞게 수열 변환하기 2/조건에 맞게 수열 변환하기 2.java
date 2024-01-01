import java.util.*;

class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        ArrayList<String> al = new ArrayList<>();
        al.add(Arrays.toString(arr));
        while(true) {
            
            for(int i = 0 ; i < arr.length;i++) {
                if(arr[i] >= 50 && arr[i] % 2 == 0) {
                    arr[i] = arr[i] / 2 ;
                }if(arr[i] < 50 && arr[i] % 2 != 0) {
                    arr[i] = arr[i]*2 + 1;
                }
               
            }
            
            //System.out.println(al);
            if (answer > 0 && al.get(answer).equals(al.get(answer - 1))) {        
                break;
            } 
            al.add(Arrays.toString(arr));
            answer++;   
                  
             
        }
        return answer-1;
    }
}