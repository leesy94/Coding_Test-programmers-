class Solution {
    public int[] solution(String myString) {
        String[] str = myString.split("x");
        int leng = myString.substring(myString.length() - 1).equals("x") ? str.length + 1 : str.length ;
        System.out.println(leng);
        int[] answer = new int[leng];
        for(int i = 0 ; i < leng;i++){
            if(myString.substring(myString.length() - 1).equals("x")) {
                if(i == leng-1)
                    answer[i] = 0;
                else
                    answer[i] = str[i].length();
            }else {
                answer[i] = str[i].length();
            }
        }
        return answer;
    }
}