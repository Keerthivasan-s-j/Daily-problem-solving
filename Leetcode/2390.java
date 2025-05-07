import java.util.*;
class Solution {
    public String removeStars(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i<s.length(); i++) {
            if (s.charAt(i) == '*' && !stack.isEmpty()) {
                stack.pop();
                continue;
            }
            stack.push(s.charAt(i));
        }
        StringBuilder res = new StringBuilder();
        for (Character ch : stack) {
            res.append(ch);
        }
        return res.toString();
    }
}