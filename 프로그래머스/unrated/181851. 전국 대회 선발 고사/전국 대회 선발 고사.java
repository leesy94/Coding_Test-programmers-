import java.util.*;
class Solution {
    public int solution(int[] rank, boolean[] attendance) {
      ArrayList<Integer> al = new ArrayList<>();
        for(int i = 0 ; i < rank.length;i++) {
            if(attendance[i] == true) {
                al.add(rank[i]);                
            }
        }
        //System.out.println(al.toString());
        Collections.sort(al);
        int a = 0;
        int b = 0;
        int c = 0;
        for(int i = 0 ;i < rank.length;i++) {
            if(al.get(0) == rank[i]) {
                a = i;
            }
            if(al.get(1) == rank[i]) {
                b = i;
            }
            if(al.get(2) == rank[i]) {
                c = i;
            }
            
        }
         //Collections.sort(al, Collections.reverseOrder());
        return 10000 * a + 100 * b + c;
    }
}