
class Solution {
    private void backtrack(int[] nums,int index,List<Integer> curr,List<List<Integer>> subset){
    if(index == nums.length){
        subset.add(new ArrayList<>(curr));
        return ;
    }
        curr.add(nums[index]);
        backtrack(nums,index+1,curr,subset);

        curr.remove(curr.size() - 1);
        backtrack(nums,index+1,curr,subset);
    }
    public List<List<Integer>> subsets(int[] nums) {
    List <List<Integer>> subset = new ArrayList<>();
    backtrack(nums,0,new ArrayList<>(),subset); 
    return subset;
    
    }

}