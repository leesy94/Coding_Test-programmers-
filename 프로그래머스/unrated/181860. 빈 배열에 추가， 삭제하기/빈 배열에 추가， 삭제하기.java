import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        
        ArrayList<Integer> al = new ArrayList<>();
        for(int i = 0 ; i < flag.length;i++) {
            if(flag[i] == true) {
                for(int j = 0; j < arr[i]*2;j++) {
                    al.add(arr[i]);    
                }                
            }else {
                for(int j = 0; j < arr[i] ; j++) {
                    al.remove(al.size()-1);    
                } 
            }
            //System.out.println(al.size()-1);
        }
        int[] answer = al.stream().mapToInt(Integer::intValue).toArray();
        
        return answer;
    }
}