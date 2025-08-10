import java.util.*;
class Solution {
    public String[] findWords(String[] words) {
        HashMap<Integer, String> keyBoard = new HashMap<>();
        keyBoard.put(1, "qwertyuiop");
        keyBoard.put(2, "asdfghjkl");
        keyBoard.put(3, "zxcvbnm");
        ArrayList<String> res = new ArrayList<>();
        for (String word : words) {
            String w = word.toLowerCase();
            for (int i = 1; i<=3; i++) {
                boolean flag = true;
                for (int j = 0; j<w.length(); j++) {
                    char ch = w.charAt(j);
                    if (keyBoard.get(i).indexOf(ch) == -1) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    res.add(word);
                    break;
                }
            }
        }
        String[] result = new String[res.size()];
        int k = 0;
        for (String word : res) {
            result[k++] = word;
        }
        return result;
    }
}