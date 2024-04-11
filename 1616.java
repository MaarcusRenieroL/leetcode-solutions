class Solution {
  public boolean checkPalindromeFormation(String a, String b) {
    return cut(a, b) || cut(b, a);
  }

  boolean cut(String a, String b) {
    int l = 0, r = a.length() - 1;

    while ((l < r) && (a.charAt(l) == b.charAt(r))) {
      l++;
      r--;
    }

    return (l >= r) ? true : palindrome(a, l, r) || palindrome(b, l, r);
  }

  boolean palindrome(String s, int i, int j) {
    while (i < j) {
      if (s.charAt(i++) != s.charAt(j--)) {
        return false;
      }
    }

    return true;
  }
}
