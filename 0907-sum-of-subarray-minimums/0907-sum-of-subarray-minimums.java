class Solution {
    public int sumSubarrayMins(int[] arr) {
        long sum = 0;
        int n = arr.length;

        int[] previous = new int[n];
        int[] next = new int[n];

        Stack<Integer> st = new Stack<>();
        for(int i=0;i<n;i++){
        while(!st.isEmpty() && arr[st.peek()]>arr[i]){
            st.pop();
        }
        if(st.isEmpty()){
            previous[i] = i + 1;
        }else{
            previous[i] = i - st.peek();
        }
        st.push(i);
        }
        st.clear();
        for(int i=n-1;i>=0;i--){
        while(!st.isEmpty() && arr[st.peek()]>=arr[i]){
            st.pop();
        }
        if(st.isEmpty()){
            next[i] = n - i;
        }else{
            next[i] = st.peek() - i;
        }
        st.push(i);
        }
        int MOD = 1_000_000_007;
        for(int i=0;i<n;i++){
            long res =(long) arr[i]*previous[i]*next[i];
            sum = ((sum+res) %MOD);
        }
        return (int)sum;
    }
}