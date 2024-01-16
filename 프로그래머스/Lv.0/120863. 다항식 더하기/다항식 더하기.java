import java.util.Arrays;

class Solution {
    public String solution(String polynomial) {
        String answer = "";
        int sum = 0;
        String arr[] = polynomial.split(" \\+ ");
        //System.out.println(Arrays.toString(arr));
        int x = 0;
        for(String str : arr) {
            if(str.contains("x")) {
                String x_str = str.substring(0,str.length()-1);
                int LageX = x_str.equals("") ? 1 : Integer.parseInt(x_str);
                //System.out.println(x);
                x += LageX;                
                //str = x+"x";
            }else {
                sum += Integer.parseInt(str);    
                //System.out.println(sum);
            }
            
        }
        
        if(sum > 0) {
            if(x > 0) {
                answer = x == 1 ? "x + " + sum : x+"x + " + sum;
            }else {
                answer = ""+sum;
            }
            
        }else {
            answer = x == 1 ? "x" : x+"x";
        }
        //System.out.println(answer);
        //answer = answer != "" ? x+"x + " + answer : x+"x";
        return answer;
    }
}