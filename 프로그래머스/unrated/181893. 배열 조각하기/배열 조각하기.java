import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr, int[] query) {
        ArrayList<Integer> ol = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            ol.add(arr[i]);
        }
        for (int i = 0; i < query.length; i++) { 
            int value = query[i];
            if (value >= 0 && value < ol.size()) {
                ArrayList<Integer> subList = new ArrayList<>();
                if (i % 2 == 0) {
                    for (int j = 0; j <= value; j++) {
                        subList.add(ol.get(j));
                    }
                } else {
                    for (int j = value; j < ol.size(); j++) {
                        subList.add(ol.get(j));
                    }
                }
                ol = new ArrayList<>(subList);
            }
        }
        int[] answer = new int[ol.size()];
        for (int i = 0; i < ol.size(); i++) {
            answer[i] = ol.get(i);
        }
        return answer;
    }
}