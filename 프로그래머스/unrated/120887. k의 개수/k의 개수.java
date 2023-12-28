import java.util.*;
class Solution {
    public int solution(int i, int j, int k) {
        
        /*for(int n = i ; n <= j ; n++) {
            if((""+n).indexOf(String.valueOf(k))) {
                answer ++;
            }
        }*/
        int count = 0;
        for(int n = i ; n <= j ; n++) {
            count += String.valueOf(n).chars().filter(d -> d == Character.forDigit(k, 10)).count();
        }
        return count;
    }
}