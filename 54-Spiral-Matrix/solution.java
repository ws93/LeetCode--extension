public class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        if (matrix == null || matrix.length == 0) {
            return res;
        }
        int rowS = 0, rowE = matrix.length - 1, colS = 0, colE = matrix[0].length - 1;
        while (rowS <= rowE && colS <= colE) {
            for (int i = colS; i <= colE; i++) {
                res.add(matrix[rowS][i]);
            }
            rowS++;

            for (int i = rowS; i <= rowE; i++) {
                res.add(matrix[i][colE]);
            }
            colE--;
            
            if (rowE >= rowS) {
                for (int i = colE; i >= colS; i--) {
                    res.add(matrix[rowE][i]);
                }
                rowE--;               
            }

            if (colE >= colS) {
                for (int i = rowE; i >= rowS; i--) {
                    res.add(matrix[i][colS]);
                }
                colS++;                
            }
        }
        return res;
    } 
}