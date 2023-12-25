import java.util.Arrays;
class Solution {
    public String solution(String code) {
        String answer = "";
        String[] arr = code.split("");
        int mode = 0;
        for(int i = 0 ; i < code.length(); i++) {
           if(mode == 0) {
                if(arr[i].equals("1")) {
                    mode = mode == 1 ? 0: 1;
                }else {
                    if(i%2==0) {
                        answer+=arr[i];
                    }
                }
               
            }else {
                if(arr[i].equals("1")) {
                    mode = mode == 1 ? 0: 1;
                }else {
                    if(i%2!=0) {
                        answer+=arr[i];
                    }
                }
            }
        }
        
        return answer.equals("") ? "EMPTY": answer;
    }
}