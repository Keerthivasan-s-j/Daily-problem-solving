class Solution {
    public int findPermutationDifference(String s, String t) {
        int[] alphabet = new int[26];
        for (int i = 0; i<s.length(); i++) {
            char ch = s.charAt(i);
            alphabet[ch - 'a'] = i;
        }
        int res = 0;
        for (int i = 0; i<s.length(); i++) {
            char ch = t.charAt(i);
            res += Math.abs(alphabet[ch - 'a'] - i);
        }
        return res;
    }
}