class Solution {
  public int[][] matrixReshape(int[][] m, int r, int c) {
    int[][] res = new int[r][c];
    int x = 0, y = 0;

    for (int i = 0; i < m.length; i++) {
      for (int j = 0; j < m[i].length; j++) {
        res[x][y] = m[i][j];
        y++;

        if (y == c) {
          y = 0;
          x++;
        }
      }
    }

    return res;
  }
}
