class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int[][] diff = new int[row][col];
        int[] onesRow = new int[row];
        int[] onesCol = new int[col];
        int[] zerosRow = new int[row];
        int[] zerosCol = new int[col];
        for (int i = 0; i<row; i++) {
            for (int j = 0; j<col; j++) {
                if (grid[i][j] == 0) {
                    zerosRow[i]++;
                    zerosCol[j]++;
                }
                else {
                    onesRow[i]++;
                    onesCol[j]++;
                }
            }
        }
        for (int i = 0; i<row; i++) {
            for (int j = 0; j<col; j++) {
                diff[i][j] = onesRow[i] + onesCol[j] - zerosRow[i] - zerosCol[j];
            }
        }
        return diff;
    }
}