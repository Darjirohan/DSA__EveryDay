class Solution {
    public int minimumPairRemoval(int[] nums) {
    int operations = 0;

    List<Integer> ls = new ArrayList<>();
    for(int i:nums) ls.add(i);

    while(!increasing(ls)){
        int minimum = Integer.MAX_VALUE;
        int index =-1;
        for(int i=0;i<ls.size()-1;i++){
            int sum = ls.get(i)+ls.get(i+1);
            if(minimum>sum){
                minimum = sum;
                index = i;
            }
        }
        int replace = ls.get(index) + ls.get(index+1);
        ls.remove(index+1);
        ls.set(index,replace);
        operations++;
    } 
    return operations;   
    }
    private boolean increasing(List<Integer> ls){
        for(int i=1;i<ls.size();i++){
            if(ls.get(i)<ls.get(i-1)){
                return false;
            }
        }
        return true;
    }
}