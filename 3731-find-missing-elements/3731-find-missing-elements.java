class Solution {
    public List<Integer> findMissingElements(int[] nums) {
    HashSet<Integer> pres = new HashSet<>();
    int min = nums[0];
    int max = nums[0];
    for(int i:nums){
        min = Math.min(min,i);
        max = Math.max(max,i);
        pres.add(i);
    }
    List<Integer> abs = new ArrayList<>();
    for(int i=min;i<max;i++){
        if(!pres.contains(i)){
            abs.add(i);
        }
    }
    return abs;
    }
}