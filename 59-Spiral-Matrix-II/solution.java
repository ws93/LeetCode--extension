public class Solution {
    public int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];
        int count = 1;
        int rowS = 0, rowE = n - 1, colS = 0, colE = n - 1;
        while (rowS <= rowE && colS <= colE) {
            for (int i = colS; i <= colE; i++) {
                res[rowS][i] = count++;
            }
            rowS++;

            for (int i = rowS; i <= rowE; i++) {
                res[i][colE] = count++;
            }
            colE--;

            if (rowS <= rowE) {
                for (int i = colE; i >= colS; i--) {
                    res[rowE][i] = count++;
                }
            }
            rowE--;

            if (colS <= colE) {
                for (int i = rowE; i >= rowS; i--) {
                    res[i][colS] = count++;
                }
            }
            colS++;
        }
        return res;
    }
}