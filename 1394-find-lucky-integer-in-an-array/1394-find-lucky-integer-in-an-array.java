class Solution {
    public int findLucky(int[] arr) {
    int luckynum=-1;
    int count[] = new int[501];
    for(int i:arr){
        count[i]++;
    }
    
    for(int i=1;i<count.length;i++){
     if(count[i]==i){
        luckynum=i;
     }
    }
    return luckynum;    
    }
}