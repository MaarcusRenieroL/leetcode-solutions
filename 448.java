class Solution {
  public List<Integer> findDisappearedNumbers(int[] nums) {
    List<Integer> r = new ArrayList<>();
    HashSet<Integer> s = new HashSet<>();

    for (int i = 0; i < nums.length; i++) {
      s.add(nums[i]);
    }

    for (int i = 1; i <= nums.length; i++) {
      if (!s.contains(i)) {
        r.add(i);
      }
    }

    return r;
  }
}
