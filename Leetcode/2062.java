import java.util.*;
class Solution {
    public static boolean isVowel(char ch){
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
    public int countVowelSubstrings(String word) {
        int res = 0;
        for (int i = 0; i<word.length()-1; i++){
            HashSet<Character> set = new HashSet<>();
            for (int j = i; j<word.length(); j++){
                if (!isVowel(word.charAt(j))){
                    break;
                }
                set.add(word.charAt(j));
                if (set.size() == 5)
                    res++;
            }
        }
        return res;
    }
}