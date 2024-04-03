class Solution {
  public List<Boolean> kidsWithCandies(int[] c, int ec) {
    List<Boolean> result = new ArrayList<>();
    int m = c[0];

    for (int i = 1; i < c.length; i++) {
      m = (m > c[i]) ? m : c[i];
    }

    for (int i = 0; i < c.length; i++) {
      result.add(c[i] + ec >= m);
    }

    return result;
  }
}
