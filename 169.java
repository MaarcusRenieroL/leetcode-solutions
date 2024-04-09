class Solution {
  public int majorityElement(int[] n) {
    HashMap<Integer, Integer> m = new HashMap<>();

    for (int num : n) {
      m.put(num, m.getOrDefault(num, 0) + 1);
    }

    for (Map.Entry<Integer, Integer> e : m.entrySet()) {
      if (e.getValue() > n.length / 2) {
        return e.getKey();
      }
    }

    return 0;

  }
}
