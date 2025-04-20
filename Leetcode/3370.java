class Solution {
    public int smallestNumber(int n) {
        int sqr = (int) Math.sqrt(n);
        while (true) {
            int num = sqr | (sqr - 1);
            if (num >= n) {
                return num;
            }
            sqr++;
        }
    }
}