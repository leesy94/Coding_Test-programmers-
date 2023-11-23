class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < myString.length(); i++) {
            if (myString.charAt(i) == 'A') {
                str.append('B');
            } else {
                str.append('A');
            }
        }
        System.out.println(str);
        return str.toString().contains(pat) ? 1 : 0;
    }
}