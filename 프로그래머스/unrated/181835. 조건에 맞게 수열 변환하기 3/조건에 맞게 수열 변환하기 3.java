class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[arr.length];
        int index = 0;
        for(int num : arr) {
            if(k%2 != 0) 
                answer[index] = num * k;
            else 
                answer[index] = num+k;
            index++;
        }
        return answer;
    }
}