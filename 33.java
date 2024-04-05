class Solution {
  public int singleNonDuplicate(int[] n) {
    int l = 0, r = n.length - 1;

    while (l < r) {
      int m = (l + r) / 2;
      if (m % 2 == 1) {
        m--;
      }

      if (n[m] != n[m + 1]) {
        r = m;
      } else {
        l = m + 2;
      }
    }

    return n[l];
  }
}
