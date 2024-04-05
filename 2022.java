class Solution {
  public int[][] construct2DArray(int[] o, int m, int n) {
    if (m * n != o.length) {
      return new int[0][0];
    }

    int[][] r = new int[m][];
    int idx = 0;

    for (int i = 0; i < m; i++) {
      r[i] = new int[n];
      for (int j = 0; j < n; j++) {
        r[i][j] = o[idx++];
      }
    }

    return r;
  }
}
