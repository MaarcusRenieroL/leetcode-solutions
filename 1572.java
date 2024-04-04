class Solution {
  public int diagonalSum(int[][] m) {
    int r = 0;

    for (int i = 0; i < m.length; i++) {
      for (int j = 0; j < m[i].length; j++) {
        if (i == j || i + j == m.length - 1) {
          r += m[i][j];
        }
      }
    }

    return r;
  }
}
