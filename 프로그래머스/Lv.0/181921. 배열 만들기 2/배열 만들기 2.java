import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        ArrayList<Integer> al = new ArrayList<>();

        for (int i = l; i <= r; i++) {
            char[] arr = String.valueOf(i).toCharArray();
            boolean bl = false;
            root : for(char ch : arr) {
                if(ch == '5' || ch == '0') {
                    bl = true;
                }else {
                    bl = false;
                   break root; 
                }
            }
            if(bl) {
                al.add(i);
            }
        }

        int[] answer;
        if (!al.isEmpty()) {
            // Convert ArrayList to int array
            answer = al.stream().mapToInt(Integer::intValue).toArray();
        } else {
            // If the list is empty, set answer to {-1}
            answer = new int[]{-1};
        }

        return answer;
    }
}