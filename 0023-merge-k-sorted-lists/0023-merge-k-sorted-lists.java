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
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(ListNode s:lists){
            while(s!=null){
                pq.add(s.val);
                s = s.next;
            }
        }
        ListNode ans = new ListNode(0);
        ListNode A = ans;
        while(!pq.isEmpty()){
            ListNode nn = new ListNode(pq.poll());
            A.next = nn;
            nn.next = null;
            A = A.next;
        }
        return ans.next;
    }
}