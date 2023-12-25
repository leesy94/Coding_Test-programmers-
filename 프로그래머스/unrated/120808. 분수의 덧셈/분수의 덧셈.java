import java.util.Arrays;
class Solution {
    public int GCD(int a, int b) {
        while(true) {
            if(a % b == 0)
                return b;
            int r = a % b;
            a = b;
            b = r;
        }
    }
    public int LCM(int a, int b) {
        return a * b / GCD(a, b);
    }
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        int min = LCM(denom1,denom2);
        System.out.println(min);
        int addedNumer = numer1 * (min / denom1) + numer2 * (min / denom2);
        
        int gcd = GCD(addedNumer, min);
        
        answer[0] = addedNumer/gcd;
        answer[1] = min/gcd;
        return answer;
    }
}