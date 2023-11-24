class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                if(i == j) 
                    answer[j][i] = 1;
                else
                    answer[j][i] = 0;
            }    
        }
        return answer;
    }
}