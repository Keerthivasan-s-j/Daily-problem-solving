import java.util.*;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        if (n==0) return 0;
        int max_len = 1;
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i<n-1; i++) {
            set.add(s.charAt(i));
            int j;
            for (j=i+1; j<n; j++) {
                if (!set.add(s.charAt(j))) {
                    set.clear();
                    break;
                }
            }
            int len = Math.abs(j - i);
            max_len = Math.max(len, max_len);
        }
        return max_len;
    }
}