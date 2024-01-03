class Solution {
    public int solution(int a, int b) {
        int answer = 1;
        int num = b/GCD(a,b);
        //System.out.println(num);
        for(int i=2; i<=num; i++) {
            while(num%i==0) {                
                if(i % 2 !=0 && i % 5 != 0) {
                    answer = 2;
                    //System.out.println(i);
                    break;
                }
                num/=i;
            }
        }
        return answer;
    }
    
    //최소공약수
    public int GCD(int a, int b) {
        while(true) {
            if(a % b == 0)
                return b;
            int r = a % b;
            a = b;
            b = r;
        }
    }
}