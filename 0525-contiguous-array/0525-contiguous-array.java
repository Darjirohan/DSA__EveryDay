class Solution {
    public int findMaxLength(int[] nums) {
    for(int i=0;i<nums.length;i++){
        nums[i] = (nums[i]==0)?-1:1;
    } 
    HashMap<Integer,Integer> mp = new HashMap<>(); 
    mp.put(0,-1);
    int n = nums.length;
    int sum = 0;
    int len = 0;
    for(int i=0;i<n;i++){
    sum+=nums[i];
    if(mp.containsKey(sum)){
        len = Math.max(len,i - mp.get(sum));
    }else{
        mp.put(sum,i);
    }
    }
    return len;  
    }
}