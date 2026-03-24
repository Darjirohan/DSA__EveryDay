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
    public int[] nextLargerNodes(ListNode head) {

    ListNode curr = head;
    ListNode prev = null;
    ListNode next = null;
    int count = 0;
    while(curr!=null){
        count++;
        next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
    }
    int[] arr = new int[count];
    Stack<Integer> st = new Stack<>();

    count = count-1;
    while(prev!=null){
        while(!st.isEmpty() && st.peek()<=prev.val){
            st.pop();
        }
        if(st.isEmpty()){
        arr[count--] = 0;
        }else{
            arr[count--] = st.peek();
        }
        st.push(prev.val);
        prev = prev.next;
    }
    return arr;
    }
}