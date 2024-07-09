import java.util.Stack;

class Solution {
    boolean solution(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(c);  // 열린 괄호는 스택에 푸시
            } else if (c == ')') {
                if (stack.isEmpty()) {
                    return false; // 스택이 비어있다면 닫힌 괄호에 대응하는 열린 괄호가 없는 것이므로 false 반환
                }
                stack.pop();  // 스택에서 열린 괄호 제거
            }
        }

        return stack.isEmpty(); // 스택이 비어있다면 모든 괄호가 올바르게 짝을 이룬 것
    }
}
