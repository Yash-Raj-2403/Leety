/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if (head == null)
            return null;
        Node temp = head, nextofTemp = null;
        Node ans = new Node(-1);
        Node tail = ans;
        while (temp != null) {
            nextofTemp = temp.next;
            Node nn = new Node(temp.val);
            temp.next = nn;
            nn.next = nextofTemp;
            temp = nextofTemp;
        }

        temp = head;
        // while(temp!=null){
        //     System.out.print(temp.val+" ");
        //     temp = temp.next;
        // }
        while (temp != null){
            if (temp.random != null) {
                temp.next.random = temp.random.next;
            }
            temp = temp.next.next;
        }

        temp = head;

        while (temp != null && temp.next != null) {
            tail.next = temp.next; tail = tail.next;
            if(temp.next != null)
            temp.next = temp.next.next;
            temp = temp.next;
        }
        return ans.next;
    }
}