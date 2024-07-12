import java.util.*;

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        Map<String, ArrayList<int[]>> map = new LinkedHashMap<>();
        
        for (int i = 0; i < genres.length; i++) {
            int[] arr = {i, plays[i]};
            map.putIfAbsent(genres[i], new ArrayList<>());
            map.get(genres[i]).add(arr);
            
            // Comparator를 사용하여 두 번째 값(plays[i])을 기준으로 내림차순 정렬
            map.get(genres[i]).sort((a, b) -> b[1] - a[1]);
        }
        
        // 각 장르별로 두 번째 값(plays[i])의 합을 계산
        Map<String, Integer> genrePlayCount = new HashMap<>();
        for (Map.Entry<String, ArrayList<int[]>> entry : map.entrySet()) {
            int totalPlays = entry.getValue().stream().mapToInt(arr -> arr[1]).sum();
            genrePlayCount.put(entry.getKey(), totalPlays);
        }

        // 장르별로 플레이 수 합계의 내림차순으로 정렬
        List<Map.Entry<String, ArrayList<int[]>>> entryList = new ArrayList<>(map.entrySet());
        entryList.sort((e1, e2) -> genrePlayCount.get(e2.getKey()) - genrePlayCount.get(e1.getKey()));

        // 정렬된 리스트를 새로운 LinkedHashMap에 삽입
        Map<String, ArrayList<int[]>> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<String, ArrayList<int[]>> entry : entryList) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }
        
        ArrayList<Integer> arr = new ArrayList<>();
        Integer[] playsArray = Arrays.stream(plays).boxed().toArray(Integer[]::new);
        
        for (Map.Entry<String, ArrayList<int[]>> entry : sortedMap.entrySet()) {
            if(entry.getValue().size() > 1) {
                arr.add(entry.getValue().get(0)[0]);
                arr.add(entry.getValue().get(1)[0]);
            }else {
                arr.add(entry.getValue().get(0)[0]);
            }
        }
        System.out.println(arr);
        
        int[] answer = new int[arr.size()];
        for(int i = 0 ; i < arr.size(); i++) {
            answer[i] = arr.get(i);
        }
        
        return answer;
    }
}