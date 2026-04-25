class Solution {
    public int[] occurrencesOfElement(int[] nums, int[] queries, int x) {
        
        int n = nums.length;
        List<Integer> ls = new ArrayList<>();

        for(int i=0;i<n;i++){
            if(nums[i]==x){
                ls.add(i);
            }
        }

        int len = queries.length;
        int[] ans = new int[len];
        int size = ls.size();
        for(int i=0;i<len;i++){
            if(queries[i]>size){
                ans[i] = -1;
            }else{
                ans[i] = ls.get(queries[i]-1);
            }
        }
        return ans;
    }
}