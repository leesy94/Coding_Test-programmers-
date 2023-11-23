import java.lang.Math;
import java.util.*;

class Solution {
    public int solution(int[] num_list) {
        /*int sum = Arrays.stream(num_list).mapToInt(i -> i).sum();
        sum = (int)Math.pow(sum,2);*/
        int sum = 0;
        int multi = 1;
        for(int num : num_list) {
            sum += num;
            multi *= num;
        }
        sum = (int)Math.pow(sum,2);
        return multi < sum ? 1 : 0 ;
    }
}