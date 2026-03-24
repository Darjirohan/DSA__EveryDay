class Solution {
    public String findDifferentBinaryString(String[] nums) {
        int n = nums.length;
        int size = 1 << n;

        boolean[] freq = new boolean[size];

        for(String s : nums){
            int decimal = Integer.parseInt(s, 2);
            freq[decimal] = true;
        }

        for(int i = 0; i < size; i++){
            if(!freq[i]){
                String ans = Integer.toBinaryString(i);
                while(ans.length() < n){
                    ans = "0" + ans;
                }
                return ans;
            }
        }

        return "";
    }
}