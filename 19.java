class Solution {
  static ListNode removeNthFromEnd(ListNode head, int n) {
    ListNode t = head;
    int l = 0;

    while (t != null) {
      l++;
      t = t.next;
    }

    if (l - n == 0) {
      return head.next;
    } else {
      t = head;

      for (int i = 0; i < l - n - 1; i++) {
        t = t.next;
      }

      t.next = t.next.next;
    }

    return head;
  }
}
