class Solution {
    public int possibleStringCount(String word) {
        int n = word.length();
        int count = 1;
        char pre = word.charAt(0);
        for (int i = 1; i<n; i++) {
            char ch = word.charAt(i);
            if (pre == ch)
                count++;
            else
                pre = ch;
        }
        return count;
    }
}