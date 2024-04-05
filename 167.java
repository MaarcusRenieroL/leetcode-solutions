class Solution {
  public int[] twoSum(int[] n, int t) {
    int[] r = new int[2];
    int s = 0, e = n.length - 1;

    while (s < e) {
      if (n[s] + n[e] > t) {
        e--;
      } else if (n[s] + n[e] < t) {
        s++;
      } else if (n[s] + n[e] == t) {
        r[0] = s + 1;
        r[1] = e + 1;
        return r;
      }
    }

    return r;
  }
}
