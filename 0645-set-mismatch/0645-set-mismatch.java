class Solution {
    public int[] findErrorNums(int[] nums) {
    int n = nums.length;
    int[] freq = new int[n+1];
    for(int i:nums){
        freq[i]++;
    }
    int[] arr = new int[2];
    for(int i=1;i<=n;i++){
        if(freq[i]>1){
            arr[0] = i;
            break;
        }
    }
    for(int i=1;i<=n;i++){
        if(freq[i] == 0){
            arr[1] = i;
            break;
        }
    }
    
    return arr;
    }
}