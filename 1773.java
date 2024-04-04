class Solution {
  public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
    int r = 0, i = 0;

    if (ruleKey.equals("type")) {
      i = 0;
    } else if (ruleKey.equals("color")) {
      i = 1;
    } else {
      i = 2;
    }

    for (List<String> item : items) {
      if (item.get(i).equals(ruleValue)) {
        r++;
      }
    }

    return r;
  }
}
