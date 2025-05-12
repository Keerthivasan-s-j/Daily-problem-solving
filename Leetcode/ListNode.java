public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public ListNode mergeNodes(ListNode head) {
        ListNode resNode = new ListNode();
        ListNode temp = resNode;
        head = head.next;
        int sum = 0;
        while (head != null) {
            int num = head.val;
            if (num == 0) {
                temp.next = new ListNode(sum);
                sum = 0;
                temp = temp.next;
            }
            sum += num;
            head = head.next;
        }
        return resNode.next;
    }
}