class Solution {
  public int findDuplicate(int[] n) {
    boolean[] v = new boolean[n.length + 1];

    for (int num : n) {
      if (v[num]) {
        return num;
      } else {
        v[num] = true;
      }
    }

    return -1;
  }
}
