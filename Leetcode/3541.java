class Solution {
    public int maxFreqSum(String s) {
        int[] freq = new int[26];
        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }
        int vowel = 0;
        int consonent = 0;
        int vowelMask = 1 | (1 << ('e' - 'a')) | (1 << ('i' - 'a')) | (1 << ('o' - 'a')) | (1 << ('u' - 'a'));
        for (int i = 0; i<26; i++) {
            if (((1 << i) & vowelMask) != 0) {
                vowel = Math.max(freq[i], vowel);
            }
            else {
                consonent = Math.max(freq[i], consonent);
            }
        }
        return vowel + consonent;
    }
}