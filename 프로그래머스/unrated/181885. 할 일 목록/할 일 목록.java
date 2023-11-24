class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {        
        int count = 0;
        for(boolean bl : finished) {
            if(bl) {
                
            }else {
                count++;
            }
        }
        int count2 = 0;
        String[] answer = new String[count];
        for(int i = 0 ; i < todo_list.length;i++){
            if(finished[i]) {
                
            }else {
                answer[count2] = todo_list[i];
                count2++;
            }
        }
        return answer;
    }
}