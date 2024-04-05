class Solution {
  public int findMin(int[] n) {
    int l = 0, r = n.length - 1;

    while (l < r) {
      int m = (l + r) / 2;

      if (n[m] < n[r]) {
        r = m;
      } else {
        l = m + 1;
      }
    }

    return n[l];
  }
}
