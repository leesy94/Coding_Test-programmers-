import java.util.PriorityQueue;
import java.util.Collections;

class Solution {
    public int solution(int[] priorities, int location) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int a : priorities) {
            queue.offer(a);
        }
        System.out.println(queue);
        int answer = 0;
        while(!queue.isEmpty()) {
            for(int i = 0; i < priorities.length ; i++) {
                if(queue.peek() == priorities[i]) {
                    queue.poll();
                    answer++;
                    System.out.println(queue);
                    
                    if(location == i) {
                        return answer;
                    }
                }
            }
        }
        
        
        return answer;
    }
}