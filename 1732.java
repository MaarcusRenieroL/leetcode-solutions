class Solution {
  public int largestAltitude(int[] g) {
    int r = 0, s = 0;

    for (int i = 0; i < g.length; i++) {
      s += g[i];
      r = (r > s) ? r : s;
    }

    return r;
  }
}
