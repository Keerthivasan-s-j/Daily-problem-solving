class Solution {
    public int myAtoi(String s) {
        s = s.trim();
        if (s.equals("")) return 0;
        int n = s.length();
        int res = 0;
        int i = 0;
        boolean isNeg = s.charAt(0) == '-';
        if (isNeg || s.charAt(0) == '+') i++;
        for ( ; i<n; i++) {
            char ch = s.charAt(i);
            if (!(ch >= '0' && ch <= '9')) break;
            if (res > Integer.MAX_VALUE / 10 || res == Integer.MAX_VALUE / 10 && ch - '0' > 7)
                return isNeg ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            res = res * 10 + (ch - '0');
        }
        return (isNeg)? -res : res;
    }
}