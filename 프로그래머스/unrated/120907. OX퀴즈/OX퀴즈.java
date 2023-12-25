import java.util.*;

class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        String[] calc = new String[3];
        for(int i = 0 ; i < quiz.length;i++) {
            int idx = quiz[i].indexOf("="); 
            int result = Integer.parseInt(quiz[i].substring(idx+2));
            int result2 = 0;
            calc = quiz[i].substring(0,idx-1).split(" ");
            String calc_item = calc[1];
            //System.out.print("중간식"+calc_item);
            switch(calc_item) {
                case "+": 
                    result2 =  Integer.parseInt(calc[0]) +  Integer.parseInt(calc[2]);
                    break;
                case "-": 
                    result2 =  Integer.parseInt(calc[0]) -  Integer.parseInt(calc[2]);
                    break;
            }
            //System.out.print("결과"+result2);
            if(result2 == result) {
                answer[i] = "O";
            }else {
                answer[i] = "X";
            }
        }
        
        return answer;
    }
}