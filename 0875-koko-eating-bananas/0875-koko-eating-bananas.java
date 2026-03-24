class Solution {
    public int minEatingSpeed(int[] piles, int h) {
    int low = 1;
    int high = 0;
    for(int i:piles){
        high = Math.max(high,i);
    }
    int result = high;
    while(low<=high){
    int mid = (high + low)/2;
    long total = 0;
    for(int i:piles){
        total += (i + mid - 1) / mid; 

    }
    if(total <= h){
        result = mid;
        high = mid-1;
    }else{
        low = mid+1;
    }    
    }
    return result;
    }
}