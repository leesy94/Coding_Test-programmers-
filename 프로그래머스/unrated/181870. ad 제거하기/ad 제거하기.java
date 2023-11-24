import java.util.*;

class Solution {
    public String[] solution(String[] strArr) {
        
        ArrayList<String> arr = new ArrayList<>();
        for(String str : strArr) {
            if(str.contains("ad")) {
                
            }else {
                arr.add(str);
            }
        }
        String[] answer = new String[arr.size()];
        for(int i = 0 ; i < arr.size();i++) {
            answer[i] = arr.get(i);
        }
        return answer;
    }
}