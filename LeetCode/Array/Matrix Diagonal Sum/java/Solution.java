class Solution {
    public int diagonalSum(int[][] mat) {
        int rows = mat.length;
        int col = mat[0].length;

        int i = 0, j = col - 1, count = 0;

        for (int k = 0; k < rows; k++) {
            if (i == j)
                count += mat[k][j];
            else
                count += mat[k][i] + mat[k][j];
            i++;
            j--;
        }

        return count;
    }
}