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
    public ListNode deleteDuplicates(ListNode head) {
        Map<Integer,Integer> mp = new TreeMap<>();
        while(head!=null){
            mp.put(head.val,mp.getOrDefault(head.val,0)+1);
            head = head.next;
        }
        ListNode ans = new ListNode(0);
        ListNode a = ans;
        for(int x:mp.keySet()){
            if(mp.get(x) ==1){
            ListNode nn = new ListNode(x);
            a.next = nn;
            nn.next = null;
            a = a.next;
            }
        }
        return ans.next;
    }
}