class Solution {
    private void permutations(int[] nums, boolean[] used, List<Integer> curr, HashSet<List<Integer>> st){
        if(curr.size() == nums.length){
            st.add(new ArrayList<>(curr));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(used[i]){
                continue;
            }
            curr.add(nums[i]);
            used[i]=true;
            permutations(nums,used,curr,st);
            curr.remove(curr.size() - 1);
            used[i] = false;
        }
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
    HashSet<List<Integer>> st = new HashSet<>();
    boolean[] used = new boolean[nums.length];
    permutations(nums,used,new ArrayList<>(),st);
    return new ArrayList<>(st);   
    }
}