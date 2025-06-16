class Solution {
    public String greatestLetter(String s) {
        int[] upper = new int[26];
        int[] lower = new int[26];
        int n = s.length();
        for (int i = 0; i<n; i++) {
            char ch = s.charAt(i);
            if (Character.isUpperCase(ch))
                upper[ch - 'A']++;
            else
                lower[ch - 'a']++;
        }
        for (int i = 25; i>=0; i--) {
            if (upper[i] > 0 && lower[i] > 0)
                return String.valueOf((char) ('A'+i));
        }

        return "";
    }
}