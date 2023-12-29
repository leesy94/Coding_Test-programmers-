import java.lang.Math;
class Solution {
    public int solution(int[] array, int n) {
        int min = array[0];
        for(int i = 0 ; i < array.length; i++) {
            if(Math.abs(n-min) > Math.abs(n - array[i])) { 
                min = array[i];
            }else if(Math.abs(n-min) == Math.abs(n - array[i])) {
                 min = array[i] > min ? min : array[i] ;                
            }
        }
        return min;
    }
}