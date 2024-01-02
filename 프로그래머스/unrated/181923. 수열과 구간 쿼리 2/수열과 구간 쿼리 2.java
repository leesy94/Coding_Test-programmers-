class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int leng = queries.length;
        int[] answer = new int[leng];
        
        for(int i = 0 ; i < leng;i++) {
            int s = queries[i][0];
            int e = queries[i][1];
            int k = queries[i][2];
            //System.out.println(s+"/"+e+"/"+k);
            int rs = -1;
            int count = 0;
            for(int j = s ; j <= e;j++) {                   
                if(arr[j] > k) {           
                    //System.out.println("arr[j]:"+arr[j] +"/k:"+ k +"/count:" +count);
                    if(count >0) {
                        if(rs > arr[j]) {
                           rs = arr[j];  
                            //System.out.println(rs);
                        }                      
                    }else {
                      rs = arr[j];    
                      //System.out.println(rs);
                    }                  
                    count++;
                }               
                
            }
            answer[i] = rs;
        }
        return answer;
    }
}