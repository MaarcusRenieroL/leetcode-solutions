class Solution {
  public ListNode deleteNode(Node n) {
    n.data = n.next.data;
    n.next = n.next.next;
  }
}
