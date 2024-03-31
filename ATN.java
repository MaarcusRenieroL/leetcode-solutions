public class ATN {
  public static void main(String[] args) {
    ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
    ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));

    ListNode result = new ATN().addTwoNumbers(l1, l2);

    while (result != null) {
      System.out.print(result.val + " ");
      result = result.next;
    }

    System.out.println();
  }

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
