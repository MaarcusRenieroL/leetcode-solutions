class Solution {
  public int[] sumZero(int n) {
    int[] r = new int[n];
    int i = 0, j = n - 1;

    while (i < j) {
      r[i++] = n;
      r[j--] = -n;
      n--;
    }

    return r;
  }
}
