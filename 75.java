class Solution {
  public void sortColors(int[] n) {
    int l = 0, r = n.length - 1, m = 0;

    while (m <= r) {
      if (n[m] == 0) {
        swap(n, l, m);
        m++;
        l++;
      } else if (n[m] == 2) {
        swap(n, r, m);
        r--;
      } else if (n[m] == 1) {
        m++;
      }
    }

  }

  void swap(int[] n, int a, int b) {
    int t = n[a];
    n[a] = n[b];
    n[b] = t;
  }
}
