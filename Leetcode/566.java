class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int total_element = mat.length * mat[0].length;
        if (total_element != r*c){
            return mat;
        }
        int[] arr = new int[total_element];
        int ind = 0;
        for (int i = 0; i<mat.length; i++){
            for (int j = 0; j<mat[0].length; j++){
                arr[ind++] = mat[i][j];
            }
        }
        int[][] res = new int[r][c];
        ind = 0;
        for (int row = 0; row<r; row++){
            for (int col = 0; col<c; col++){
                res[row][col] = arr[ind++];
            }
        }
        return res;
    }
}