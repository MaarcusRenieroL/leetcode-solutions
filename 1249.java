class Solution {
  public String minRemoveToMakeValid(String str) {
    int s = 0, e = str.length() - 1, o = 0;
    String r = "";

    char[] sa = str.toCharArray();

    for (int i = 0; i < sa.length; i++) {
      if (sa[i] == '(') {
        o++;
      } else if (sa[i] == ')') {
        if (o == 0) {
          sa[i] = '*';
        } else {
          o--;
        }
      }
    }

    for (int i = sa.length - 1; i >= 0; i--) {
      if (o > 0 && sa[i] == '(') {
        sa[i] = '*';
        o--;
      }
    }

    int p = 0;

    for (int i = 0; i < sa.length; i++) {
      if (sa[i] != '*') {
        sa[p++] = sa[i];
      }
    }

    r = new String(sa).substring(0, p);

    return r;
  }
}
