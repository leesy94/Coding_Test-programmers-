import java.util.ArrayList;
class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        ArrayList<String> arr = new ArrayList<>();
        for(int i = 0 ; i < my_string.length();i++) {
            //my_string = String.valueOf(my_string.charAt(indices[i]));
            arr.add(String.valueOf(my_string.charAt(i))); 
        }
        System.out.println(arr);
        for(int i = 0 ; i < indices.length;i++) {
            arr.set(indices[i],"");
        }
        for(int i = 0 ; i < arr.size();i++) {
            answer += arr.get(i);
        }
        return answer;
    }
}