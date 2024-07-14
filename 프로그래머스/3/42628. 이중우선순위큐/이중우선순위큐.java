import java.util.PriorityQueue;
import java.util.StringTokenizer;
import java.util.Collections;
import java.util.Iterator;

class Solution {
    public int[] solution(String[] operations) {
        PriorityQueue<Integer> min = new PriorityQueue<>();
        PriorityQueue<Integer> max = new PriorityQueue<>(Collections.reverseOrder());
        StringTokenizer st;
        
        for(int i=0;i<operations.length;i++) {
            st = new StringTokenizer(operations[i]);
            char op = st.nextToken().charAt(0);
            int num = Integer.parseInt(st.nextToken());
            
            //System.out.println(st);
            
            switch(op) {
                case 'I':
                    min.add(num);
                    max.add(num);
                    break;
                case 'D':
                    if(max.isEmpty()) break;
                    if(num == 1) {
                        int del = max.poll();
                        min.remove(del);
                    }
                    if(num == -1) {
                        int del = min.poll();
                        max.remove(del);
                    }
            }
            System.out.println("max"+max);
            System.out.println("min"+min);
            System.out.println("-----");
        }
        
        if(max.isEmpty())
            return new int[] {0, 0};
        
        return new int[] {max.peek(), min.peek()};
    }
}