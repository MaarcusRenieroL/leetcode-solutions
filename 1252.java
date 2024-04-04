class Solution {
  public int oddCells(int x, int y, int[][] i) {
    int[][] m = new int[x][y];
    int r = 0;

    for (int a = 0; a < i.length; a++) {
      for (int b = 0; b < y; b++) {
        m[i[a][0]][b]++;
      }

      for (int b = 0; b < x; b++) {
        m[b][i[a][1]]++;
      }
    }

    for (int a = 0; a < x; a++) {
      for (int b = 0; b < y; b++) {
        if (m[a][b] % 2 != 0) {
          r++;
        }
      }
    }

    return r;
  }
}
