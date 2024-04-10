class Solution {
  public ListNode sortList(ListNode h) {
    if (h == null || h.next == null) {
      return h;
    }

    ListNode m = findMid(h), l = sortList(h), r = sortList(m);

    return merge(l, r);
  }

  ListNode findMid(ListNode h) {
    ListNode s = h, f = h;

    while (f != null && f.next != null && f.next.next != null) {
      s = s.next;
      f = f.next.next;
    }

    ListNode m = s.next;
    s.next = null;

    return m;
  }

  ListNode merge(ListNode l, ListNode r) {
    ListNode d = new ListNode(), t = d;

    while (l != null && r != null) {
      if (l.val < r.val) {
        t.next = l;
        l = l.next;
      } else {
        t.next = r;
        r = r.next;
      }

      t = t.next;
    }

    if (l != null) {
      t.next = l;
    }

    if (r != null) {
      t.next = r;
    }

    return d.next;
  }
}
