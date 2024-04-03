class Solution {
  public int maximumWealth(int[][] a) {
    int r = 0;

    for (int[] i : a) {
      int s = 0;
      for (int j : i) {
        s += j;
      }
      r = (s > r) ? s : r;
    }

    return r;
  }
}
