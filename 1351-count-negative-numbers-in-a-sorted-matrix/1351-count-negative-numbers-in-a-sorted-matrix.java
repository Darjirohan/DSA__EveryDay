class Solution {
    public int countNegatives(int[][] grid) {
    int count = 0 ;
    for(int[] row: grid){
    int low = 0;
    int high = row.length - 1;
    while(low<=high){
        int mid = low + (high - low)/2;
         if(row[mid]>=0){
            low = mid + 1;
         }else{
            high = mid - 1;
         }
    }
    count += (row.length - low);   
    }    
    return count;
    }
}