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
    public ListNode modifiedList(int[] nums, ListNode head) {
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        HashSet<Integer> st = new HashSet<>();

        for(int i:nums){
            st.add(i);
        }
        ListNode temp = head;
        while(temp!=null){
            if(!st.contains(temp.val)){
                tail.next = temp;
                tail = tail.next;
            }
            temp = temp.next;
        }
        tail.next = null;
        return dummy.next;
    }
}