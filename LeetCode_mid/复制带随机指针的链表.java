/*
// Definition for a Node.
class Node {
    public int val;
    public Node next;
    public Node random;

    public Node() {}

    public Node(int _val,Node _next,Node _random) {
        val = _val;
        next = _next;
        random = _random;
    }
};
*/
class Solution {
    public Node copyRandomList(Node head) { 
        if(head == null){
            return null;
        }
        Node cur = head;
        while(cur!=null){
            Node node = new Node(cur.val);
            node.random = null;
            node.next = cur.next;
            cur.next = node;
            cur = node.next;
        }
       
        cur = head;
        while(cur!=null){
            Node p = cur.next;
            if(cur.random != null){
                p.random = cur.random.next;
            }

            cur = cur.next.next;
        }
        Node head_copy = head.next;
        Node p1 = head;
        while(p1 !=null){
            Node p2 = p1.next;
            p1.next = p2.next;
            p1 = p2.next;
            if(p2.next !=null){
                p2.next = p1.next;
            }
        }
        return head_copy;
    }
}