class Solution {
    public boolean detectCapitalUse(String word) {
        boolean first = word.charAt(0) >= 'A' && word.charAt(0) <= 'Z';
        int lower = 0;
        int upper = 0;
        for (int i=1; i<word.length(); i++){
            char ch = word.charAt(i);
            if (ch >= 'a' && ch <= 'z'){
                lower++;
            }
            if (ch >= 'A' && ch <= 'Z'){
                upper++;
            }
        }
        if (first){
            upper++;
        }
        else{
            lower++;
        }
        if (word.length() == lower || word.length() == upper){
            return true;
        }
        else if (first && ++lower == word.length()){
            return true;
        }
        return false;
    }
}