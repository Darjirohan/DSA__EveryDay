class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        
        Stack<Integer> st = new Stack<>();
        int j=0;
        int n = popped.length;
        for(int i=0;i<n;i++){
        st.push(pushed[i]);
        while(!st.isEmpty() && j<n && st.peek()==popped[j]){
            st.pop();
            j++;
        }
        }
        return st.isEmpty();
    }
}