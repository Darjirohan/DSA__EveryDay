class Solution {
    public List<Long> mergeAdjacent(int[] nums) {
    Stack<Long> st = new Stack<>();

    for(int i=0;i<nums.length;i++){
        long sum = nums[i];
        while(!st.isEmpty() && st.peek()==sum){
            sum+=st.pop();
        }
        st.push(sum);
    }
    List<Long> ls = new ArrayList<>();

    while(!st.isEmpty()){
    ls.add(st.pop());
    } 
    Collections.reverse(ls); 
    return ls;  
    }
}