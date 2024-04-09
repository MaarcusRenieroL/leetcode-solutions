class Solution {
  public int threeSumClosest(int[] n, int t) {
    Arrays.sort(n);

    int rs = n[0] + n[1] + n[2], md = Integer.MAX_VALUE;

    for (int i = 0; i < n.length - 2; i++) {
      int l = i + 1, r = n.length - 1;

      while (l < r) {
        int s = n[i] + n[l] + n[r];

        if (s == t) {
          return t;
        } else if (s < t) {
          l++;
        } else {
          r--;
        }

        int d = (s - t) > 0 ? (s - t) : -(s - t);
        if (d < md) {
          rs = s;
          md = d;
        }
      }
    }

    return rs;
  }
}
