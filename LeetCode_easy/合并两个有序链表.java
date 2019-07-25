/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode cur1 = l1;
        ListNode cur2 = l2;
        ListNode result = null;
        ListNode last = null;
        if(l1 == null)return l2;
        if(l2 == null)return l1;
        while(cur1 != null && cur2 !=null){
            if(cur1.val <= cur2.val){
                ListNode next = cur1.next;
                if(result == null){
                    result = cur1;
                }else{
                    last.next = cur1;
                }
                last = cur1;
                cur1 = next;
            }else{
                if(cur1.val >= cur2.val){
                    ListNode next = cur2.next;
                    if(result == null){
                        result = cur2;
                    }else{
                        last.next = cur2;
                    }
                    last = cur2;
                    cur2 = next;
                }
            }
        }
        if(cur1 == null){
            last.next = cur2;
        }else{
            last.next = cur1;
        }
        return result;
    }
}