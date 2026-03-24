class Solution {

    public int maxFrequencyElements(int[] nums) {
    if(nums.length == 0){
        return 0;
    }
    int[] arr = new int[101];
    for(int i:nums){
        arr[i]++;
    }  
    int maxfreq = 0;
    int count=0;
    for(int i:arr){
        if(maxfreq<i){
            maxfreq = i;
            count =1;
        }else if(maxfreq == i){
            count++;
        }
    }
   
    return count*maxfreq;
    }
}