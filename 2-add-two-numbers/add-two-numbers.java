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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode current = dummyHead;
        int carry = 0;
        
        // Loop through both lists until we reach the end and there is no carry left
        while (l1 != null || l2 != null || carry != 0) {
            int sum = carry;
            
            // Add value from l1 if available
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            
            // Add value from l2 if available
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            
            // Calculate the new carry
            carry = sum / 10;
            
            // Create a new node with the digit value and attach it to the result list
            current.next = new ListNode(sum % 10);
            current = current.next;
        }
        
        return dummyHead.next;
    }
}