class Solution {
    public boolean isSubsequence(String s, String t) {
        int count = s.length();
        int ind = 0;
        int i = 0;
        while (i<t.length()) {
            if (count == 0)
                return true;
            if (s.charAt(ind) == t.charAt(i)) {
                count--;
                ind++;
            }
            i++;
        }
        return count == 0;
    }
}