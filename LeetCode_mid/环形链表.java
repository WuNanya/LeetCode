 // 步骤一：使用快慢指针判断链表是否有环
    ListNode p = head, p2 = head;
    boolean hasCycle = false;
    while (p2.next != null && p2.next.next != null) {
        p = p.next;
        p2 = p2.next.next;
        if (p == p2) {
            hasCycle = true;
            break;
        }
    }
    
    // 步骤二：若有环，找到入环开始的节点
    if (hasCycle) {
        ListNode q = head;
        while (p != q) {
            p = p.next;
            q = q.next;
        }
        return q;
    } else 
        return null;
}
