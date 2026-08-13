/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode curr = head;
        ListNode before = null;
        int pos = 1;
        while(pos < left){
            before = curr;
            curr = curr.next; 
            pos++;
        }
        ListNode prev = before;
        int t = right - left + 1;
        while(t > 0){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            t--;
        }
        if(before != null){
            before.next.next = curr;
            before.next = prev;
        }
        else{
            head.next = curr;
            return prev;
        }
        return head;        
    }
}