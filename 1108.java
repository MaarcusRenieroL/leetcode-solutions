class Solution {
  public String defangIPaddr(String a) {
    String r = "";
    int i = 0;

    while (i != a.length() - 1) {
      if (a.charAt(i) == '.') {
        r += "[.]";
        i++;
      } else {
        r += a.charAt(i);
      }
    }

    return r;
  }
}
