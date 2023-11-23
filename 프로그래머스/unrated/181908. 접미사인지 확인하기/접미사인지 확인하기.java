class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        int leng = my_string.length();
        for(int i = 0 ; i < leng; i++) {
            if(my_string.equals(is_suffix)) {
                answer = 1;
                break;
            }
            my_string = my_string.substring(1);
        }
        return answer;
    }
}