class Solution {
    public ListNode doubleIt(ListNode head) {
        ListNode rever = reverse(head);

        int carry = 0;
        ListNode temp = rever;

        while(temp != null){
            int val = temp.val * 2 + carry;
            temp.val = val % 10;
            carry = val / 10;

            if(temp.next == null && carry > 0){
                temp.next = new ListNode(carry);
                break;
            }

            temp = temp.next;
        }

        return reverse(rever);
    }

    private ListNode reverse(ListNode head){
        ListNode prev = null, curr = head;

        while(curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }
}