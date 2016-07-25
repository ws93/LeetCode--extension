public class Solution {
    public boolean isValid(String s) {
        if(s.length() % 2 != 0) {
            return false;
        }
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (stack.empty()) {
                stack.push(s.charAt(i));
                continue;
            }
            if (validP(stack.peek(), s.charAt(i))) {
                stack.pop();
            } else {
                stack.push(s.charAt(i));
            }
        }
        if(stack.empty()) {
            return true;
        } else {
            return false;
        }
    }
    private boolean validP(char pre, char curt) {
        if(pre == '(' && curt == ')') return true;
        if(pre == '[' && curt == ']') return true;
        if(pre == '{' && curt == '}') return true;
        return false;
    }
}