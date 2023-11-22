
class Solution {
    public String solution(String my_string) {
        String answer = "";        
        /*char[] arr = new char[my_string.length()];
        int count = arr.length -1;
        for(int i = 0 ; i < arr.length;i++){
             arr[i] = my_string.charAt(count);
            count--;
        }
        answer = Arrays.toString(arr);*/
        for(int i = my_string.length() -1; i >= 0 ; i--) {
            answer += my_string.charAt(i);
        }
        return answer ;
    }
}