class Solution {
    private void reverse(char[] str, int left, int right) {
        while (left < right) {
            char temp = str[left];
            str[left] = str[right];
            str[right] = temp;
            left++;
            right--;
        }
    }
    public String reverseWords(String s) {
        int start = 0;
        int n = s.length();
        char[] str = s.toCharArray();
        for (int end = 0; end <= n; end++) {
            if (end == n || str[end] == ' '){
                reverse(str, start, end-1);
                start = end + 1;
            }
        }
        return new String(str);
    }
}