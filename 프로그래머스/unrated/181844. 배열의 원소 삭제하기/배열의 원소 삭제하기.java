import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Loop1 :
        for(int i = 0 ; i < arr.length ; i ++) {
            boolean tf = false;
            Loop2 :
            for(int j = 0 ; j < delete_list.length ; j ++) {
                if(arr[i] != delete_list[j]) {
                     tf=true;    
                    
                }else {
                    tf=false;
                    break Loop2;
                }
                //System.out.println(arr[i] + " " +delete_list[j] + " " + tf);
            }
            if(tf) { 
                arrayList.add(arr[i]);  
            }
            System.out.println();
        }
        int[] answer = new int[arrayList.size()];
        int size = 0 ; 
        for(int temp : arrayList){ 
            answer[size++] = temp;
        }
        
        return answer;
    }
}