import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Integer> queue = new LinkedList<>();
        int sum = 0; // 다리에 올라온 트럭 중량
        int time = 0 ;
        
        for(int i = 0 ; i < truck_weights.length ; i++) {
            int truck = truck_weights[i];
            
            while(true) {
                
            if(queue.isEmpty()) {
                queue.add(truck);
                sum += truck;
                time++;
                break;
            }else if(queue.size() == bridge_length) {
                sum -= queue.poll();
            }else {
                if(sum + truck <= weight) {
                    queue.add(truck);
					sum += truck;
					time++; // 다리에 오를 때만 시간 추가 
					break;
                }else {
                    queue.add(0);
					time++;
                }
            }
               // System.out.println("truck:"+truck+" time:"+time+" sum"+sum+" queue"+queue);
                
            }
          //  System.out.println("--------");
            
        }
        return time + bridge_length;
    }
}