class Solution {
    public String replaceDigits(String s) {
        StringBuffer res = new StringBuffer();
        char[] str = s.toCharArray();
        int len = str.length;
        for (int i = 1; i<len; i+=2){
            char chr = str[i-1];
            int digit = str[i] - '0';
            res.append(chr);
            res.append((char) ((chr - 'a' + digit) % 26 + 'a'));
        }
        if (len % 2 == 1){
            res.append(str[len - 1]);
        }
        return res.toString();
    }
}