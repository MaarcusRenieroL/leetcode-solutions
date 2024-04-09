class Solution {
  public boolean containsDuplicate(int[] n) {
    HashMap<Integer, Integer> m = new HashMap<>();

    for (int num : n) {
      m.put(num, m.getOrDefault(num, 0) + 1);
    }

    for (Map.Entry<Integer, Integer> e : m.entrySet()) {
      if (e.getValue() >= 2) {
        return true;
      }
    }

    return false;

  }
}
