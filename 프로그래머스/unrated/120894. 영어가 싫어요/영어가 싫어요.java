class Solution {
    public long solution(String numbers) {
        String arr[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String digits[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        for(int i = 0 ; i < arr.length;i++){
            numbers = numbers.replaceAll(arr[i],digits[i]);
        }
        return Long.parseLong(numbers);
    }
}