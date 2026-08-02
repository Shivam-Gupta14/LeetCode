import java.util.*;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        if (matrix.length == 0) return result;

        int strow = 0;
        int endrow = matrix.length - 1;
        int stcol = 0;
        int endcol = matrix[0].length - 1;

        while (strow <= endrow && stcol <= endcol) {
            // Top row (left to right)
            for (int j = stcol; j <= endcol; j++) {
                result.add(matrix[strow][j]);
            }
            strow++;

            // Right column (top to bottom)
            for (int i = strow; i <= endrow; i++) {
                result.add(matrix[i][endcol]);
            }
            endcol--;

            // Bottom row (right to left)
            if (strow <= endrow) {
                for (int j = endcol; j >= stcol; j--) {
                    result.add(matrix[endrow][j]);
                }
                endrow--;
            }

            // Left column (bottom to top)
            if (stcol <= endcol) {
                for (int i = endrow; i >= strow; i--) {
                    result.add(matrix[i][stcol]);
                }
                stcol++;
            }
        }

        return result;
    }
}
