class Solution {
  public String longestPalindrome(String str) {
    if (str == null || str.length() < 1) {
      return "";
    }

    int s = 0, e = 0;

    for (int i = 0; i < str.length(); i++) {
      int l1 = expandFromMiddle(str, i, i);
      int l2 = expandFromMiddle(str, i, i + 1);

      int l = Math.max(l1, l2);

      if (l > e - s) {
        s = i - ((l - 1) / 2);
        e = i + (l / 2);
      }
    }

    return str.substring(s, e + 1);
  }

  public int expandFromMiddle(String s, int l, int r) {
    if (s == null || l > r) {
      return 0;
    }

    while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
      l--;
      r++;
    }

    return r - l - 1;
  }
}
