class Solution {
  public int numIdenticalPairs(int[] n) {
    int r = 0;

    for (int i = 0; i < n.length; i++) {
      for (int j = i; j < n.length; j++) {
        if ((i < j) && (n[i] == n[j])) {
          r++;
        }
      }
    }

    return r;
  }
}
