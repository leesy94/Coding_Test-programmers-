class Solution {
    public int[] solution(int[] arr) {
        int leng = 0;
        for(int i : arr){
            leng += i;
        }
        int count = 0 ; 
        int[] answer = new int[leng];
        for(int i = 0 ; i < arr.length;i++) {
            for(int j = 0 ; j < arr[i] ; j++){
                answer[count] = arr[i];
                count++;
            }
        }
        //System.out.println(leng);
        return answer;
    }
}