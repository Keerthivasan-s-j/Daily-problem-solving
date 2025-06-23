class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int a = -1;
        int b = -1;
        int[] map = new int[n * n];
        for (int i = 0; i<n; i++) {
            for (int j = 0; j<n; j++) {
                map[grid[i][j]-1]++;
            }
        }
        for (int i = 0; i<n*n; i++) {
            int num = map[i];
            if (a != -1 && b != -1)
                break;
            if (num == 2)
                a = i+1;
            else if (num == 0) 
                b = i+1;
        }
        return new int[] {a,b};
    }
}