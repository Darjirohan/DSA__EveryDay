class Solution {
    public long subArrayRanges(int[] nums) {

    long sum = maxS(nums) - minS(nums);

    return sum;
    }
    private long minS(int[] nums){
        int n = nums.length;
        long sum = 0;
        int[] previous = new int[n];
        int[] next = new int[n];

        Stack<Integer> st = new Stack<>();
        for(int i=0;i<n;i++){
        while(!st.isEmpty() && nums[st.peek()]>nums[i]){
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
        while(!st.isEmpty() && nums[st.peek()]>=nums[i]){
            st.pop();
        }
        if(st.isEmpty()){
            next[i] = n - i;
        }else{
            next[i] = st.peek() - i;
        }
        st.push(i);
        }
        for(int i=0;i<n;i++){
            sum +=(long) nums[i]*previous[i]*next[i];
        }
        return sum;   
    }
    private long maxS(int[] nums){
        int n = nums.length;
        long sum = 0;
        int[] previous = new int[n];
        int[] next = new int[n];

        Stack<Integer> st = new Stack<>();
        for(int i=0;i<n;i++){
        while(!st.isEmpty() && nums[st.peek()]<nums[i]){
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
        while(!st.isEmpty() && nums[st.peek()]<=nums[i]){
            st.pop();
        }
        if(st.isEmpty()){
            next[i] = n - i;
        }else{
            next[i] = st.peek() - i;
        }
        st.push(i);
        }
        for(int i=0;i<n;i++){
            sum+= (long) nums[i]*previous[i]*next[i];
            
        }
        return sum;   
    }
}