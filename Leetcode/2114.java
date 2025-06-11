class Solution {
    public int mostWordsFound(String[] sentences) {
        int max_word = 1;
        for (String str : sentences) {
            int word = 1;
            for (char ch : str.toCharArray()) {
                if (ch == ' ')
                    word++;
            }
            if (word > max_word)
                max_word = word;
        }
        return max_word;
    }
}