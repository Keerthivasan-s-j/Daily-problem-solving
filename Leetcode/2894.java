class Solution {
    public int differenceOfSums(int n, int m) {
        int n2 = n/m;
        return n * (n + 1) / 2 - n2 * (n2 + 1) * m;
    }
}