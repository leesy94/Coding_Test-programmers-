class Solution {
    static boolean[] visited;  
    static int answer = 0;
    public int solution(int k, int[][] dungeons) {
        visited = new boolean[dungeons.length];  
        
        fatigue(0,k,dungeons);
        
        return answer;
    }
    
     public void fatigue(int depth, int now, int[][] dungeons) {
        // 각 호출에서 최대 depth를 업데이트
        answer = Math.max(answer, depth);
        
        for (int i = 0; i < dungeons.length; i++) {
            if (visited[i]) continue;
            if (now < dungeons[i][0]) continue;
            
            //System.out.println(depth+"/"+now);

            visited[i] = true;
            fatigue(depth + 1, now - dungeons[i][1], dungeons);
            visited[i] = false;
        }
         //System.out.println("-----------");
    }
}