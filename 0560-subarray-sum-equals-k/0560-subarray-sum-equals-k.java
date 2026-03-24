import java.util.*;
class Solution {
    public int subarraySum(int[] nums, int k) {
    int presum=0,count=0;
    HashMap<Integer,Integer> map = new HashMap<>();
    map.put(0,1);
    for(int i=0;i<nums.length;i++){
        presum+=nums[i];
        int rem = presum - k;
        count+=map.getOrDefault(rem,0);
        map.put(presum,map.getOrDefault(presum,0)+1);
    }
    return count;
    }
}