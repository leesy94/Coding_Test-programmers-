import java.util.ArrayList;
class Solution {
    public int[] solution(int[] arr, int k) {
        ArrayList<Integer> al = new ArrayList<>(); 
        for(int i : arr) {
            if(al.size() == k) {
                break;
            }else {
                if(!(al.contains(i))) {
                    al.add(i);   
                }
            }
            
        }
        int al_leng = al.size();
        if(al_leng < k) {
            for(int i = 0 ; i < k - al_leng; i++) {
                al.add(-1);   
            }    
        }
        
        int[] answer = al.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}