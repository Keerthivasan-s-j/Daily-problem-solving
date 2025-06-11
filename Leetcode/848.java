class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        int n = shifts.length;
        char[] res = s.toCharArray();
        int sum = 0;
        for (int i = n - 1; i>=0; i--) {
            sum += shifts[i] % 26;
            res[i] = (char) ((res[i] - 'a' + sum) % 26 + 'a');
        }
        return new String(res);
    }
}