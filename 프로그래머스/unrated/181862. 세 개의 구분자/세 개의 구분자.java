import java.util.*;
class Solution {
    public String[] solution(String myStr) {
        String[] answer = myStr.split("a|b|c");
        ArrayList<String> al = new ArrayList<>();
        for(int i = 0; i < answer.length;i++) {
            if(!(answer[i].equals("") || answer[i] == null)) {
                al.add(answer[i]);
            }
        }
        String[] arr = {"EMPTY"};
        if(al.size() >0) {
            arr = al.toArray(new String[al.size()]);
        }  
        return arr;
    }
}