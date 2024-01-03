class Solution {
    public int solution(int chicken) {
        int answer = chicken / 10;
        int coupon = chicken % 10 + answer;
        while(coupon > 9) {
            answer += (coupon / 10);
            coupon = (coupon % 10) + (coupon / 10);
        }
        return answer;
    }
}