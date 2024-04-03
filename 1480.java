class Solution {
  public int[] runningSum(int[] n) {
    int[] r = new int[n.length];

    for (int i = 0; i < n.length; i++) {
      int s = 0;
      for (int j = 0; j < i + 1; j++) {
        s += n[j];
      }
      r[i] = s;
    }

    return r;
  }
}
