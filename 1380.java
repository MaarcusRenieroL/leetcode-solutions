class Solution {
  public List<Integer> luckyNumbers(int[][] m) {
    List<Integer> r = new ArrayList<>();

    for (int i = 0; i < m.length; i++) {
      int min = Integer.MAX_VALUE, idx = -1;

      for (int j = 0; j < m[i].length; j++) {
        if (m[i][j] < min) {
          min = m[i][j];
          idx = j;
        }
      }

      boolean f = true;
      for (int j = 0; j < m.length; j++) {
        if (m[j][idx] > min) {
          f = false;
        }
      }

      if (f) {
        r.add(min);
      }
    }

    return r;
  }
}
