class Solution {
  public int reachNumber(int t) {
    int r = 0, c = 0;
    t = (t > 0) ? t : -t;

    while (c < t || (c - t) % 2 != 0) {
      r++;
      c += r;
    }

    return r;
  }
}
