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
    public ListNode sortList(ListNode head) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        while(head!= null){
            pq.add(head.val);
            head = head.next;
        }
        ListNode ans = new ListNode(1);
        ListNode a = ans;
        while(!pq.isEmpty()){
            ListNode nn = new ListNode(pq.poll());
            a.next = nn;
            nn.next = null;
            a = a.next;
        }
        return ans.next;
    }
}