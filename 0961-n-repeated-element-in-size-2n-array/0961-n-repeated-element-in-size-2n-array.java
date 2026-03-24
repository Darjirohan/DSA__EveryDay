class Solution {
    public int repeatedNTimes(int[] nums) {
    Set<Integer> st = new HashSet<>();
    for(int i:nums){
        if(!st.add(i)){
            return i;
        }
    }
    return 1;    
    }
}