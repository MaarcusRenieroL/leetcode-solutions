class Solution {
  public boolean judgeCircle(String m) {
    int l = 0, r = 0, u = 0, d = 0;

    for (char c : m.toCharArray()) {
      if (c == 'U') {
        u++;
      } else if (c == 'D') {
        d++;
      } else if (c == 'L') {
        l++;
      } else {
        r++;
      }
    }

    return (u == d && l == r);
  }
}
