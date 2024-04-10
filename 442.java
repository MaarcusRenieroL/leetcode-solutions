class Solution {
  public List<Integer> findDuplicates(int[] n) {
    Set<Integer> s = new HashSet<>();
    List<Integer> a = new ArrayList<>();

    for (int num : n) {
      if (s.contains(num)) {
        a.add(num);
      } else {
        s.add(num);
      }
    }

    return a;

  }
}
