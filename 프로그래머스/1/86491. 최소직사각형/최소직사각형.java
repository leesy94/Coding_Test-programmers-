import java.util.Arrays;
import java.util.stream.Stream;

class Solution {
    public int solution(int[][] sizes) {
        int[][] arr = new int[2][sizes.length];
        
        for(int i = 0 ; i < sizes.length;i++) {
            if(sizes[i][1] > sizes[i][0]) {
                int a = sizes[i][1];
                sizes[i][1] = sizes[i][0];
                sizes[i][0] = a;
            }
            arr[0][i] = sizes[i][0];
            arr[1][i] = sizes[i][1];
        }
        int wid = Arrays.stream(arr[0]).max().getAsInt();
        int hei = Arrays.stream(arr[1]).max().getAsInt();
        
        //System.out.println(Arrays.toString(arr));
        return wid * hei;
    }
}