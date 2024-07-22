import java.util.ArrayList;
import java.util.List;
class Solution {
    //static List<String> list;
    static String [] words = {"A", "E", "I", "O", "U"};
    static int answer = 0;
    static int cnt = 0;
    public int solution(String word) {
        //list = new ArrayList<>();
        dfs("", 0,word);
        return answer;
    }

    static void dfs(String str, int len, String word) {
        //list.add(str);
        if(str.equals(word)) {
            answer = cnt;
            return;
        }
        if (len == 5) return;
        for (int i = 0; i < 5; i++) {
            cnt++;
            dfs(str + words[i], len + 1, word);
            if (answer != 0) return;
        }        
    }
}