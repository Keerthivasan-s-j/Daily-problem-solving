class Solution {
    public String toLowerCase(String s) {
        int n = s.length();
        StringBuilder res = new StringBuilder();
        for (int i = 0; i<n; i++){
            char ch = s.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                res.append((char) (ch-'A'+'a'));
            }
            else {
                res.append(ch);
            }
        }
        return res.toString();
    }
}