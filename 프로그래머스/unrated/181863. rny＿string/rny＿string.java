class Solution {
    public String solution(String rny_string) {
        String answer = "";
        if(rny_string.contains("m")) {
            for(int i = 0 ; i < rny_string.length();i++){
                if(rny_string.charAt(i) == 'm') {
                    answer+= "rn";
                }else {
                    answer+= rny_string.charAt(i);
                }
            }
        }else {
            answer = rny_string;
        }
        return answer;
    }
}