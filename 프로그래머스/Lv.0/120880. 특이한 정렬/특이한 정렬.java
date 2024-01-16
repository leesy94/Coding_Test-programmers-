import java.util.Arrays;

class Solution {
    public int[] solution(int[] numlist, int n) {
        int[] device = new int[numlist.length];

        // Calculate absolute differences
        for (int i = 0; i < numlist.length; i++) {
            device[i] = Math.abs(n - numlist[i]);
        }

        // Create an array of indices
        Integer[] indices = new Integer[numlist.length];
        for (int i = 0; i < numlist.length; i++) {
            indices[i] = i;
        }

        // Sort indices based on the absolute differences and prioritize larger values
        Arrays.sort(indices, (a, b) -> {
            int result = Integer.compare(device[a], device[b]);
            if (result == 0) {
                // If absolute differences are equal, prioritize larger values
                return Integer.compare(numlist[b], numlist[a]);
            }
            return result;
        });

        // Retrieve the sorted indices
        int[] sortedIndices = Arrays.stream(indices).mapToInt(Integer::intValue).toArray();

        // Populate the answer array using the sorted indices
        int[] answer = new int[numlist.length];
        for (int i = 0; i < numlist.length; i++) {
            answer[i] = numlist[sortedIndices[i]];
        }

        return answer;
    }
}