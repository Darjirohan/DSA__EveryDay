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
    public ListNode rotateRight(ListNode head, int k) {
    if(head == null) return head;
    ListNode traverse = head;
    int count = 1;
    while(traverse.next != null) {
        traverse = traverse.next;
        count++;
    } 
    traverse.next = head;
    k = k%count;
    int front = count - k;
    ListNode tail = head;
    for(int i=1;i<front;i++){
       tail = tail.next;
    }
    head = tail.next;
    tail.next = null;
    return head;
    }
}