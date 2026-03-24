class Solution {
    int reverse(int num){
        int rev = 0;
        while(num>0){
            int digit = num % 10;
            rev = rev*10 + digit;
            num /= 10;
        }
        return rev;
    }
    public int countDistinctIntegers(int[] nums) {
    HashSet <Integer> st = new HashSet<>();
    for(int i = 0;i<nums.length;i++){
        st.add(nums[i]);
        st.add(reverse(nums[i]));
    }
    return st.size();
    }
}