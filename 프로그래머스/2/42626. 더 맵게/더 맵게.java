import java.util.PriorityQueue;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        
        // 우선순위 큐 사용하여 효율적인 데이터 관리
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int s : scoville) {
            pq.add(s);
        }
        
        while (pq.peek() < K) {
            if (pq.size() < 2) {
                answer = -1; // K 이상으로 만들 수 없는 경우
                break;
            }
            
            int first = pq.poll();
            int second = pq.poll();
            
            int newScoville = first + (second * 2);
            pq.add(newScoville);
            
            answer++;
        }
        
        return answer;
    }
}
