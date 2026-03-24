import java.util.*;
class Solution {
    public int findDuplicate(int[] nums) {
    HashMap<Integer,Integer> map = new HashMap<>();
    for(int i:nums){
       if(map.getOrDefault(i,0) == 0){
        map.put(i,1);
       }else{
        return i;
       }
    }
    return -1;
    }
}