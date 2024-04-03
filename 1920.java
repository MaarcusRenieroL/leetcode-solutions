class Solution {
  public int[] buildArray(int[] n) {
    int[] r = new int[n.length];

    for (int i = 0; i < n.length; i++) {
      r[i] = n[n[i]];
    }

    return r;
  }
}
