class Solution {
  public int[][] transpose(int[][] m) {
    int[][] r = new int[m[0].length][m.length];

    for (int i = 0; i < m.length; i++) {
      for (int j = 0; j < m[i].length; j++) {
        r[j][i] = m[i][j];
      }
    }

    return r;
  }
}
