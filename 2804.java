class Solution {
  static ListNode insertGCD(ListNode head) {
    ListNode curr = head;
    ListNode prev = null;

    while (curr.next != null) {
      prev = curr;
      curr = curr.next;

      ListNode temp = new ListNode(gcd(prev.val, curr.val));

      temp.next = prev.next;
      prev.next = temp;
    }

    return head;
  }

  static int gcd(int x, int y) {
    if (y == 0) {
      return x;
    }

    return gcd(y, x % y);
  }
}
