class Solution {
  public ListNode deleteDuplicates(ListNode h) {
    ListNode t = h;

    while (t != null && t.next != null) {
      if (t.val == t.next.val) {
        t.next = t.next.next;
      }

      t = t.next;
    }

    return h;
  }
}
