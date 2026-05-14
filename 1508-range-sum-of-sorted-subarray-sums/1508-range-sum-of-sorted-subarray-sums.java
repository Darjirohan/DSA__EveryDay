class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        long res = 0;
        List<Integer> ls = new ArrayList<>();
        int MOD = 1_000_000_007;
        for(int i=0;i<n;i++){
            int sum =0;
            for(int j=i;j<n;j++){
                sum+=nums[j];
                ls.add(sum);
            }
        }
        Collections.sort(ls);
        for(int i=left-1;i<right;i++){
        res = (res + ls.get(i))%MOD;
        }
        return (int)res%MOD;
    }
}