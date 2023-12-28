import java.util.*;
class Solution {
    public String solution(String letter) {
        String answer = "";
        String[] letterArr = letter.split(" ");
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        LinkedHashMap <String, String> result = new LinkedHashMap <>();
        for(int i = 0 ; i < morse.length;i++) {
            result.put(morse[i],String.valueOf((char)(i+97)));
        }
        for(int i = 0 ; i < letterArr.length;i++) {
            answer+= result.get(letterArr[i]);
        }
        /*for (String key : result.keySet()) {	
            System.out.println(key + " : " + result.get(key));	
        }*/
        return answer;
    }
}