class Solution {
    public List<Integer> findDuplicates(int[] nums) {
    int n = nums.length;
    int[] freq = new int[n+1];
    List<Integer> ls = new ArrayList<>();
    for(int i:nums){
        freq[i]++;
    } 
    for(int i=0;i<n+1;i++){
        if(freq[i]>1) ls.add(i);
    }  
    return ls; 
    }
}