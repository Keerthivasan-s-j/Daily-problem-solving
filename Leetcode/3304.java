class Solution {
    public char kthCharacter(int k) {
        StringBuilder word = new StringBuilder("a");
        int len = 1;
        while (len < k) {
            StringBuilder gen = new StringBuilder();
            for (int i = 0; i<len; i++) {
                char ch = word.charAt(i);
                char next = (char) (((ch + 1 - 'a') % 26) + 'a');
                gen.append(next);
            }
            word.append(gen);
            len = word.length();
        }
        return word.charAt(k-1);
    }
}