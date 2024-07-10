import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

class Solution {
    public int solution(String[][] clothes) {
        Map<String,ArrayList<String>> map = new HashMap<>();
        
         for (int i = 0; i < clothes.length; i++) {
            String category = clothes[i][1];
            String item = clothes[i][0];
             
            map.putIfAbsent(category, new ArrayList<>());
             
            map.get(category).add(item);
        }
        System.out.println(map);
        int answer = 1;
        for (ArrayList<String> items : map.values()) {
            answer *= (items.size() + 1);
        }
        
        return answer - 1;
    }
}