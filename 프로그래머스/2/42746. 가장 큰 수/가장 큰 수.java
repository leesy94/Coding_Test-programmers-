import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        String[] numStrs = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            numStrs[i] = String.valueOf(numbers[i]);
        }

        // 정렬 기준을 정의
        Arrays.sort(numStrs, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                // 두 문자열을 붙여서 더 큰 값을 만드는 순서로 정렬
                return (o2 + o1).compareTo(o1 + o2);
            }
        });

        // 정렬된 문자열을 합쳐서 결과 생성
        StringBuilder sb = new StringBuilder();
        for (String numStr : numStrs) {
            sb.append(numStr);
        }

        // 결과가 0으로 시작하면 (즉, 모든 숫자가 0인 경우) 0을 반환
        String answer = sb.toString();
        if (answer.startsWith("0")) {
            return "0";
        }

        return answer;
    }
}