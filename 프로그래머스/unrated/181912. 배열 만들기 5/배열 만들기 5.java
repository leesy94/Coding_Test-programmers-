import java.util.*;
class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0 ; i < intStrs.length;i++) {
            int str = Integer.parseInt(intStrs[i].substring(s,s+l));
            if(str > k) {
                arr.add(str);
            }
        }
        return arr.stream().mapToInt(Integer::intValue).toArray();
    }
}