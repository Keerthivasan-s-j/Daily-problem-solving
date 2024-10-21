class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        int n = mat.length;
        for (int i = 0; i<n; i++){
            int pos = n-i-1;
            sum += mat[i][i];
            if (i != pos)
                sum += mat[i][pos];
        }
        return sum;
    }
}
