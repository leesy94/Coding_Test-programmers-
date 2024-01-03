class Solution {
    public int[] solution(String[] keyinput, int[] board) {        
        int max_x = (board[0]-1)/2;
        int max_y = (board[1]-1)/2;
        int x = 0;
        int y = 0;
        /*for(int i = 0; i < keyinput.length ; i++) {
            switch(keyinput[i]) {
                case "up": y++; break;
                case "down": y--; break;
                case "left": x--; break;
                case "right": x++ ; break;
            }
        }
        x = x > max_x ? max_x : x ;
        x = x < max_x * -1 ? max_x * -1 : x;
        y = y > max_y ? max_y : y ;
        y = y < max_y * -1 ? max_y * -1 : y;*/
        
        for(int i = 0; i < keyinput.length ; i++) {
            if(keyinput[i].equals("up") && y < max_y) {
                y++;
            }
            if(keyinput[i].equals("down") && y > -max_y) {
                y--;
            }
            if(keyinput[i].equals("left") && x > -max_x) {
                x--;
            }
            if(keyinput[i].equals("right") && x < max_x) {
                x++;
            }
        }
        
        int[] answer = {x,y};
        return answer;
    }
}