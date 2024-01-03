import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        String str = "";
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        for(int i = 0; i < a.length();i++) {
            if(Character.isUpperCase(a.charAt(i))){
                str += String.valueOf(a.charAt(i)).toLowerCase();
            }else {
                str += String.valueOf(a.charAt(i)).toUpperCase();
            }
        }
        System.out.println(str);
    }
}