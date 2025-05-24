import java.util.*;
class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> res = new ArrayList<>();
        int i = 0;
        for (String word : words) {
            if (word.indexOf(x) != -1) res.add(i);
            i++;
        }
        return res;
    }
}