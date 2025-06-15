class Solution {
    public String removeDuplicates(String s) {
        int n = s.length();
        int[] stack = new int[n];
        int top = -1;
        for (int i = 0; i<n; i++) {
            char ch = s.charAt(i);
            if (top != -1 && stack[top] == ch) {
                top--;
            }
            else {
                stack[++top] = ch;
            }
        }
        return new String(stack, 0, top+1);
    }
}