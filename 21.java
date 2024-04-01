class Solution {
  ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    ListNode h = new ListNode();
    ListNode t = h;

    while ((l1 != null) && (l2 != null)) {
      if (l1.val < l2.val) {
        t.next = l1;
        l1 = l1.next;
        t = t.next;
      } else {
        t.next = l2;
        l2 = l2.next;
        t = t.next;
      }
    }

    t.next = (l1 != null) ? l1 : l2;

    return h.next;
  }
}
