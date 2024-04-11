class Solution {
  public boolean halvesAreAlike(String s) {
    s = s.toLowerCase();
    String l = "", r = "";

    for (int i = 0; i < s.length() / 2; i++) {
      l += s.charAt(i);
    }

    for (int i = s.length() / 2; i < s.length(); i++) {
      r += s.charAt(i);
    }

    return countVowels(l) == countVowels(r);
  }

  int countVowels(String s) {
    int r = 0;

    for (char c : s.toCharArray()) {
      if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
        r++;
      }
    }

    return r;
  }
}
