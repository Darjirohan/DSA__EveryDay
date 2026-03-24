class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
    Arrays.sort(candidates);
    List<List<Integer>> res = new ArrayList<>();
    backtrack(candidates,target,0,new ArrayList<>(),res);
    return res;
    }
    private void backtrack(int[] candi,int target,int start,List<Integer> curr,List<List<Integer>> res){
    if(target == 0){
        res.add(new ArrayList<>(curr));
        return;
    }
    for(int i=start;i<candi.length;i++){
        if (i > start && candi[i] == candi[i - 1]) continue;
        if (candi[i] > target) break;
        
        curr.add(candi[i]);
        backtrack(candi,target - candi[i],i+1,curr,res);
        curr.remove(curr.size() - 1);
        
    }
    }
}