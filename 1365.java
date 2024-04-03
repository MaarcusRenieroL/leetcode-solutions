class Solution {
  public int[] smallerNumbersThanCurrent(int[] n) {
    int[] r = new int[n.length];

    for (int i = 0; i < n.length; i++) {
      int c = 0;
      for (int j = 0; j < n.length; j++) {
        if ((j != i) && (n[j] < n[i])) {
          c++;
        }
      }

      r[i] = c;
    }

    return r;
  }
}
