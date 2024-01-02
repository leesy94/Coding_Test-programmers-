class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length];
        String[] result = new String[picture.length * k];
        int count = 0; 
        for(int i = 0 ; i < picture.length; i++) {
            String str = "";
            for(int j = 0 ; j < picture[i].length();j++) {
               str += (String.valueOf(picture[i].charAt(j)).repeat(k));
            }
            answer[i] = str;
            for(int j  = i*k ; j < (i+1)*k ; j++ ) {
               // System.out.println(j);
                result[j] = answer[i];
                //count++;
            }
        }
        
        
        return result;
    }
}