import java.util.Arrays;

class Solution {
    public int[] solution(String my_string) {
        String intStr = my_string.replaceAll("[^\\d]", "");
        int[] answer = intStr.chars()
                            .map(Character::getNumericValue)
                            .sorted()
                            .toArray();
        return answer;
    }
}