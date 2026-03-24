class Solution {
    public int[] searchRange(int[] nums, int target) {
    int[] index=new int[2];
if(nums.length==0 || target<nums[0] || (nums.length==1 && nums[0]!=target) || target>nums[nums.length-1]){
        index[0]=-1;
        index[1]=-1; 
    }
    else{
        if(nums.length==1 && nums[0]==target){
        index[0]=0;
        index[1]=0;     
        }
        else{
        int val=0;
        int left=0;
        int right=nums.length-1;
        while(left<=right){
        int mid=left+(right-left)/2;
        if(target==nums[mid]){
            index[0]=mid;
            index[1]=mid;
            val=1;
            break;
        }
        else if(nums[mid]<target){
            left=mid+1;
        }else{
            right=mid-1;
        }
        }
        if(val==1){
                        left= index[0];
                        right= index[1];

                    while (left > 0 && nums[left - 1] == target) {
                        left--;
                    }
                    while ( right< nums.length - 1 && nums[right + 1] == target) {
                        right++;
                    }

                    index[0] = left;
                    index[1] = right;
                } else {
                    index[0] = -1;
                    index[1] = -1;
                }
    }
    }
    return index;    
    }
}