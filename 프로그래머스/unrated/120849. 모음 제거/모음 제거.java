class Solution {
    public String solution(String my_string) {
        String answer = "";
        String[] list = new String[]{"a", "e", "i", "o", "u"};
        /*
         for(int i = 0 ; i < my_string.length();i++) {
             for(String m : list) {
                 if(!m.equals(String.valueOf(my_string.charAt(i)))){
                     answer += my_string.charAt(i);
                 }
             }
        }*/
        for(String m : list) {
            my_string = my_string.replaceAll(m, "");
        }
        answer = my_string;
        return answer;
    }
}