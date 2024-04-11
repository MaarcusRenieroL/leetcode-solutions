class Solution {
  public int numOfStrings(String[] p, String w) {
    int r = 0;

    for (String s : p) {
      if (w.contains(s)) {
        r++;
      }
    }

    return r;
  }
}
