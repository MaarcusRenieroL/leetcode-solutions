class Solution {
  public boolean checkIfPangram(String s) {
    HashMap<Character, Integer> m = new HashMap<>();

    for (int i = 0; i < s.length(); i++) {
      m.put(s.charAt(i), 1);
    }

    for (int i = 0; i < 26; i++) {
      if (!m.containsKey((char) ('a' + i))) {
        return false;
      }
    }

    return true;
  }
}
