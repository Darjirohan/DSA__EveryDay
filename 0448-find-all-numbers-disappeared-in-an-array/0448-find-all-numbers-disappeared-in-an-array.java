class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
    int n = nums.length;
    int[] freq = new int[n+1];
    for(int i:nums){
        freq[i]++;
    }
    List <Integer> ls = new ArrayList<>();
    for(int i=1;i<=n;i++){
        if(freq[i]==0){
            ls.add(i);
        }
    }
    return ls;    
    }
}