class Solution {
  public List<Boolean> kidsWithCandies(int[] c, int ec) {
    List<Boolean> r = new ArrayList<>();
    int m = 0;

    for (int k : c) {
      m = (m > k) ? m : k;
    }

    for (int k : c) {
      r.add(k > m);
    }

    return r;
  }
}
