class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        int len = s.length();
        String res = "";
        String word = "";
        for (int i = 0; i<len; i++){
            char chr = s.charAt(i);
            if (chr != ' '){
                word += chr;
            }
            else if(chr == ' '){
                if(res.length() != 0 && word.length() != 0){
                    res = word + " " + res;
                    word = "";
                }
                else{
                    res = word + res;
                    word = "";
                }
            }
        }
        if(res.length() != 0 && word.length() != 0){
            res = word + " " + res;
            word = "";
        }
        else{
            res = word + res;
            word = "";
        }
        return res;
    }
}