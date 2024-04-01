class Solution {
  static int numJewwlsInStones(String j, String s) {
    int result = 0;

    HashMap<Character, Integer> map = new HashMap<>();

    for (char c : s.toCharArray()) {
      map.put(c, map.getOrDefault(c, 0) + 1);
    }

    for (char c : j.toCharArray()) {
      if (map.containsKey(c)) {
        result += map.get(c);
      }
    }

    return result;
  }
}
