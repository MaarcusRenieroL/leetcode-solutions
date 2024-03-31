class ListNode {
  int val;
  ListNode next;

  ListNode() {
  }

  ListNode(int val) {
    this.val = val;
  }

  ListNode(int val, ListNode next) {
    this.val = val;
    this.next = next;
  }
}

class Solution {
  ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    int sum = 0, carry = 0;
    ListNode dummy = new ListNode(0);
    ListNode temp = dummy;

    while (l1 != null || l2 != null) {
      if (l1 != null) {
        sum += l1.val;
        l1 = l1.next;
      }

      if (l2 != null) {
        sum += l2.val;
        l2 = l2.next;
      }

      sum += carry;

      carry = sum / 10;

      temp.next = new ListNode(sum % 10);

      sum = 0;

      temp = temp.next;
    }

    if (carry > 0) {
      temp.next = new ListNode(carry);
    }

    return dummy.next;

  }

}
