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
    int ht(ListNode head){
        int c=0;
        while(head!=null){
            c++;
            head = head.next;
        }
        return c;
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode curr = head,prev = null;
        int fin = ht(head)-n;
        if(fin ==0) return head.next;
        int c =0;
        while(c<fin){
            prev = curr;
            curr = curr.next;
            c++;
        }
        prev.next = curr.next;
        return head;
    }
}