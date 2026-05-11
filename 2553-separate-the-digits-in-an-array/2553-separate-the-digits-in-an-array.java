class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer> ls = new ArrayList<>();
        int n = nums.length;
        for(int i=0;i<n;i++){
            int num = nums[i];

            int len = (int)Math.log10(num);

            while(len>=0){
                int pow = (int)Math.pow(10,len);

                ls.add(num/pow);
                num = num%pow;
                len--;
            }
        }
        int size = ls.size();

        int[] ans = new int[size];

        for(int i=0;i<size;i++){
            ans[i] = ls.get(i);
        }
        return ans;
    }
}