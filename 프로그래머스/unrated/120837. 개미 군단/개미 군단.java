class Solution {
    public int solution(int hp) {
        int num1 = hp / 5 ; 
        int num2 = (hp - num1*5) / 3 ;
        int num3 = hp - num1*5 - num2*3 ; 
        return num1+num2+num3;
    }
}