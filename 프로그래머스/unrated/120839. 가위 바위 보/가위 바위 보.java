class Solution {
    public String solution(String rsp) {
        String answer = "";
        int count = 0 ; 
        while(count < rsp.length()) {
            switch(rsp.charAt(count)){
                case '0' : answer+= "5"; break;
                case '2' : answer+= "0"; break;
                case '5' : answer+= "2"; break;
            }
            count++;
        }
        return answer;
    }
}