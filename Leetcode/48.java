class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int[][] mat = new int[n][n];
        for (int i = 0; i<n; i++) {
            mat[i] = matrix[i].clone();
        }
        for (int row = 0; row<n; row++) {
            for (int col = 0; col<n; col++) {
                matrix[col][n-1-row] = mat[row][col];
            }
        }
    }
}