class Solution {
    public void setZeroes(int[][] matrix) {
         int n=matrix.length;
        int m=matrix[0].length;
        boolean isColZero = false;
        for (int i = 0; i < n; i++) {
            /*
              If MATRIX[0][i] is 0, then isColZero = true. Because we have found a 0 in,
              the 1st column so we have to set the entire 1st column to be 0.
            */
            if (matrix[i][0] == 0) {
                isColZero = true;
            }
            for (int j = 1; j < m; j++) {
                if (matrix[i][j] == 0) {
                    // We have to set that entire row to be 0
                    matrix[i][0]=0;
                    // We have to set that entire column to be 0
                    matrix[0][j]=0;
                }
            }
        }
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                /*
                  If starting cell of row or starting cell of column is zero,
                  then set entry at i,j to 0.
                */
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j]=0;
                }
            }
        }
        // If MATRIX[0][0] is 0, then we have to set the entire 1st row to be 0
        if (matrix[0][0] == 0) {
            for (int j = 0; j < m; j++) {
                matrix[0][j]=0;
            }
        }
        // If isColZero is true, then we have to set the entire 1st column to be 0
        if (isColZero) {
            for (int i = 0; i < n; i++) {
                matrix[i][0]=0;
            }
        }
    
    }
}
