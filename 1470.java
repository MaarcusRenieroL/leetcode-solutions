class Solution {
  public int[] shuffle(int[] n, int k) {
    int[] r = new int[2 * k];
    int j = 0;

    for (int i = 0; i < n.length; i += 2) {
      r[i] = n[j++];
      r[i + 1] = n[k++];
    }

    return r;
  }
}
