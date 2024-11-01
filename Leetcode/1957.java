class Solution {
    public String makeFancyString(String s) {
        StringBuffer str = new StringBuffer();
        for(int i = 0; i<s.length(); i++){
            int len = str.length();
            if (len >= 2 && str.charAt(len - 1) == s.charAt(i) && str.charAt(len - 2) == s.charAt(i)){
                continue;
            }
            str.append(s.charAt(i));
        }
        return str.toString();
    }
}