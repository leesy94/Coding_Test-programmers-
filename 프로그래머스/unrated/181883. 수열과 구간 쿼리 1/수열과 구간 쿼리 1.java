class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[arr.length];
        for(int j = 0 ; j < queries.length;j++) {  
            for(int i = 0 ; i < arr.length;i++) {   
                if(queries[j][0] <= i && i <= queries[j][1] ) {
                    arr[i]++;
                    //break roop;
                }    
            }            
        }
        return arr;
    }
}