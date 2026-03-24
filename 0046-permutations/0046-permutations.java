class Solution {
    private void permutations(int[] nums,boolean[] used, List<Integer> curr,List<List<Integer>> ls){
        if(curr.size() == nums.length){
            ls.add(new ArrayList<>(curr));
            return;
        }
        for(int i=0;i<nums.length;i++){
           if(used[i]){
            continue;
           }
           curr.add(nums[i]);
           used[i] = true;
           permutations(nums,used,curr,ls);
           curr.remove(curr.size() - 1);
           used[i] = false;
        }

    }
    public List<List<Integer>> permute(int[] nums) {
    List<List<Integer>> ls = new ArrayList<>();
    boolean[] used = new boolean[nums.length];
    permutations(nums,used,new ArrayList<>(),ls);
    return ls;
    }
}