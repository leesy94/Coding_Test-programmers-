class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] arr = my_string.split(" ");
        for(int i = 0 ; i < arr.length;i++) {
            if(i == 1) {
                if(arr[i].equals("+")) {
                    answer = Integer.parseInt(arr[i-1])+Integer.parseInt(arr[i+1]);
                }
                if(arr[i].equals("-")) {
                    answer = Integer.parseInt(arr[0])-Integer.parseInt(arr[2]);
                }
            }else {
                if(arr[i].equals("+")) {
                    answer += Integer.parseInt(arr[i+1]);
                }
                if(arr[i].equals("-")) {
                    answer -= Integer.parseInt(arr[i+1]);
                }
            }
        }
        
        
        return answer;
    }
}