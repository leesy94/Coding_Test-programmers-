class Solution {
    public int[] solution(int brown, int yellow) {
        int y_wid = 0;
        int y_hei = 0;
        
        //int sqrt = (int) Math.sqrt(yellow);
        /*if(isPrime(yellow)) {
            y_wid = yellow;
            y_hei = 1;
        }else {*/
            for(int i = yellow ; i >= 1 ; i--){
               if(yellow % i == 0){
                   y_wid = i;
                   y_hei = yellow / i;
                   if(y_wid >= y_hei && (((y_wid+2) * 2 + (y_hei+2) * 2) - 4 == brown)) break;
                }
            }
        
                
        return new int[] {y_wid+2 , y_hei+2};
    }
    
    /*public boolean calc(int y_wid,int y_hei,int brown) {
        return ((y_wid+2) * 2 + (y_hei+2) * 2) - 4 == brown;
    }*/
    
    /*public boolean isPrime(int num){
        if(num==0) return false;
        for(int i=2; i*i<=num;i++){
            if(num%i==0) return false;
        }
        return true;
    }*/
}