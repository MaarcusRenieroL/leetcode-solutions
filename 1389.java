class Solution {
  public int[] createTargetArray(int[] n, int[] i) {
    int[] r = new int[n.length];
    List<Integer> l = new ArrayList<>();

    for (int j = 0; j < n.length; j++) {
      l.add(i[j], n[j]);
    }

    int h = 0;
    for (int j : l) {
      r[h++] = j;
    }

    return r;
  }
}
