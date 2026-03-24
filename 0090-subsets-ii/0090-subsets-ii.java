import java.util.*;
class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
    List <List<Integer>> subset = new  ArrayList<>();
    Arrays.sort(nums);
    for(int i=0;i<(1<<nums.length);i++){
        List <Integer> set = new ArrayList<>();
        for(int j=0;j<nums.length;j++){
            if((i & (1<<j)) != 0 ){
              set.add(nums[j]);  
            }
        }
        if(!subset.contains(set)){
            subset.add(set);
        }
    } 
    
    return subset;  
    }
}