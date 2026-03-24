class Solution {
    public int minimumCost(int[] cost) {
    Arrays.sort(cost);
    int max_cost = 0;
    int count=1;
    for(int i=cost.length-1;i>=0;i--){
        if(count%3!=0){
            max_cost+=cost[i];
        }
        count++;
    }  
    return max_cost;
    }
}