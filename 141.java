class Solution {
  public boolean hasCycle(ListNode h) {
    ListNode f = h;
    ListNode s = h;

    while (f != null && f.next != null) {
      s = s.next;
      f = f.next.next;

      if (f == s) {
        return true;
      }
    }

    return false;
  }
}
