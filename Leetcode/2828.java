import java.util.*;
class Solution {
    public boolean isAcronym(List<String> words, String s) {
        if (words.size() != s.length()) return false;
        int i = 0;
        for (String str : words) {
            if (str.charAt(0) != s.charAt(i++))
                return false;
        }
        return true;
    }
}