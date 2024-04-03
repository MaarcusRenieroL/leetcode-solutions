class Solution {
  public int[] getConcatenation(int[] n) {
    int[] r = new int[n.length * 2];

    for (int i = 0; i < n.length; i++) {
      r[i] = n[i];
      r[i + n.length] = n[i];
    }

    return r;
  }
}
