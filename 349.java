class Solution {
  public int[] intersection(int[] n1, int[] n2) {
    Set<Integer> s = new HashSet<>();
    Set<Integer> i = new HashSet<>();

    for (int n : n1) {
      s.add(n);
    }

    for (int n : n2) {
      if (s.contains(n)) {
        i.add(n);
      }
    }

    int[] r = new int[i.size()];
    int idx = 0;
    for (int n : i) {
      r[idx++] = n;
    }

    return r;
  }
}
