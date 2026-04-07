class Solution {
    public int numComponents(ListNode head, int[] nums) {
        HashSet<Integer> st = new HashSet<>();
        
        for(int x : nums) st.add(x);
        
        int count = 0;
        ListNode curr = head;
        
        while(curr != null){
            if(st.contains(curr.val) && 
               (curr.next == null || !st.contains(curr.next.val))){
                count++;
            }
            curr = curr.next;
        }
        return count;
    }
}