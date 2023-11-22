class Solution {
    public String solution(String my_string) {
        String answer = "";
        for(int i = 0; i < my_string.length() ; i++) {
        char currentChar = my_string.charAt(i);
            if (Character.isUpperCase(currentChar)) {
                answer += Character.toLowerCase(currentChar);
            } else {
                answer += Character.toUpperCase(currentChar);
            }
        }
        return answer;
    }
}