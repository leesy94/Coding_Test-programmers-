import java.util.Arrays;
import java.lang.Math;
import java.util.LinkedHashMap;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int leng = progresses.length;
        //int[] left = new int[progresses.length];
        int[] day = new int[leng]; // 작업일수
        int[] arr = new int[leng]; // 배포일
        LinkedHashMap<Integer,Integer> map = new LinkedHashMap<>(); //배포횟수
        
        
        for(int i = 0; i < leng; i++) {
            //left[i] = 100 - progresses[i];
            day[i] = (int)(Math.ceil((100 - progresses[i]) / (double)speeds[i]));
            //System.out.println((100 - progresses[i]) / speeds[i]);
        }
        //System.out.println("day"+Arrays.toString(day));
        arr[0] = day[0];
        for(int i = 1; i < leng; i++) {            
            if(day[i] > arr[i-1]) {
                arr[i] = day[i];
            }else {
                arr[i] = arr[i-1];
            }
        }
        //System.out.println("arr"+Arrays.toString(arr));
        for(int num : arr) {       
            if(map.containsKey(num)) {
                map.put(num,map.get(num)+1);
            }else {
                map.put(num,1);
            }
            //System.out.println(map);
        }
        int[] answer = new int[map.size()];
        int num = 0;
        for(int val : map.values()) {
            answer[num++] = val;
        }     
        //System.out.println(Arrays.toString(answer));
        
        return answer;
    }
}