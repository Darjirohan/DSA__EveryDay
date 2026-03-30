class Solution {
    public int minLength(int[] nums, int k) {

        HashMap<Integer,Integer> mp = new HashMap<>();
        int ans = Integer.MAX_VALUE;
        long sum=0;
        int left=0;
        for(int right=0;right<nums.length;right++){
            if(!mp.containsKey(nums[right])){
            mp.put(nums[right],1);
            sum+=nums[right];
            }else{
            mp.put(nums[right],mp.get(nums[right])+1);
            }
            while(sum>=k){
                ans = Math.min(ans, right - left + 1);

                mp.put(nums[left], mp.get(nums[left]) - 1);

                if(mp.get(nums[left]) == 0){
                    sum -= nums[left];  
                    mp.remove(nums[left]);
                }

                left++;
            }
        }
        return ans==Integer.MAX_VALUE?-1:ans;
    }
}