class Solution {
    public String solution(String str1, String str2) {
        String answer = "";
        int leng = str1.length() > str2.length() ? str1.length() : str2.length() ;
        for(int i = 0 ; i < leng; i++) {
            answer += String.valueOf(str1.charAt(i))+String.valueOf(str2.charAt(i));
        }
        return answer;
    }
}