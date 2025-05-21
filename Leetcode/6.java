class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1) return s;

        StringBuilder[] arr = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            arr[i] = new StringBuilder();
        }
        int row = 0;
        boolean direction_down = false;
        for (char ch : s.toCharArray()) {
            arr[row].append(ch);
            if (row == 0 || row == numRows - 1) direction_down = !direction_down;
            row += (direction_down) ? 1 : -1;
        }
        StringBuilder res = new StringBuilder();
        for (StringBuilder str : arr) {
            res.append(str);
        }
        return res.toString();
    }
}