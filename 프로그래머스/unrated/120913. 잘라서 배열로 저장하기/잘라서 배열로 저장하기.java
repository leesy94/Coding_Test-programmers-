class Solution {
    public String[] solution(String my_str, int n) {
        int leng = (my_str.length() % n == 0) ? my_str.length()/n : my_str.length()/n+1;
        String[] answer = new String[leng];
        for(int i = 0 ; i < leng;i++) {
            //int slice = i*n;
            if(my_str.length() % n != 0 && i == leng -1) {
                answer[i] = my_str.substring(n*i,my_str.length());
            }else {
                answer[i] = my_str.substring(n*i,n*(i+1));
            }
        }
        return answer;
    }
}