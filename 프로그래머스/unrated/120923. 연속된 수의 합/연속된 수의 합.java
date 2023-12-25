class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int mid = total / num ;
        int count = num / 2;
        int idx = num%2!=0?mid - count:mid - count+1; 
        System.out.println(mid+"/"+count+"/"+idx);
        for(int i = 0 ; i < num ; i++) {
            answer[i] = idx;
            idx++;
        }
        return answer;
    }
}