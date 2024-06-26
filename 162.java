class Solution {
  public int findPeakElement(int[] n) {
    int l = 0, r = n.length - 1;

    while (l < r) {
      int m = (l + r) / 2;

      if (n[m] > n[m + 1]) {
        r = m;
      } else {
        l = m + 1;
      }
    }

    return l;
  }
}
