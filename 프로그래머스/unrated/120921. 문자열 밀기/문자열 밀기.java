class Solution {
    public int solution(String A, String B) {
        int answer = 0;
        for(int i = 1 ; i <= A.length(); i++) {
            if(A.equals(B)){
                break;
            }else {
                answer = -1;
            }
            String A_copy = String.valueOf(A.charAt(A.length() - 1));
            int count = 0 ; 
            while(count < A.length() -1) {                                
                A_copy += A.charAt(count);
                count++;
            }
            A = A_copy;
            if(A_copy.equals(B)) {
                answer = i;
                break;
            }
        }
        return answer;
    }
}