class Solution {
  public int maxSubArray(int[] n) {
    if (n.length == 1) {
      return n[0];
    }

    int s = 0, m = n[0];

    for (int i = 0; i < n.length; i++) {
      s += n[i];
      m = (m > s) ? m : s;
      s = (s < 0) ? 0 : s;
    }

    return m;
  }
}
