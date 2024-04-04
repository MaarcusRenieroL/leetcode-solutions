class Solution {
  public boolean findRotation(int[][] m, int[][] t) {
    int c0 = 0, c90 = 0, c180 = 0, c270 = 0;

    for (int i = 0; i < m.length; i++) {
      for (int j = 0; j < m[i].length; j++) {
        if (t[i][j] == m[m.length - j - 1][i]) {
          c90++;
        }

        if (t[i][j] == m[m.length - i - 1][m.length - j - 1]) {
          c180++;
        }

        if (t[i][j] == m[j][m.length - i - 1]) {
          c270++;
        }

        if (t[i][j] == m[i][j]) {
          c0++;
        }
      }
    }
    if ((c0 == m.length * m.length) || (c90 == m.length * m.length) || (c180 == m.length * m.length)
        || (c270 == m.length * m.length)) {
      return true;
    } else {
      return false;
    }
  }
}
