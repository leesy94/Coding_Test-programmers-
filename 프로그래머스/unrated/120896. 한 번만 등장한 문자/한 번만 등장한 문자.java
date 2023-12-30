import java.util.*;
class Solution {
    public String solution(String s) {
        
        int[] arr = new int[26];
        for(int i = 0 ; i < arr.length;i++) {
            for(int j = 0 ; j < s.length() ; j ++) {
                if(s.charAt(j) == i+97) {
                    arr[i]++;
                }
            }
            
        }
        String answer = "";
        for(int i = 0 ; i < arr.length;i++) { 
            if(arr[i] == 1) {
                answer = answer + (char)(i + 97);
            }
        }
        return answer;
    }
}