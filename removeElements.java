/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if(head == null){
            return head;
        }
        // 记住返回的是头指针
        ListNode returnNode = head;
        while(head.next != null){
            if(head.next.val == val){
                head.next = head.next.next;
            }else{
                head = head.next;
            }
        }
        // 把第一个head最后来处理，先把之后的处理了
        return returnNode.val == val?returnNode.next:returnNode;
    }
}