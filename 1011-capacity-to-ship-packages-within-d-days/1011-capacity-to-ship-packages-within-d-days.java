class Solution {
    public int shipWithinDays(int[] weights, int days) {
        
        int max = 0;
        
        int min = 0;
        for(int i:weights){
            min = Math.max(min,i);
            max +=i;
        }
        int result = max;
        while(min<=max){
            int mid = min + (max - min)/2;
            
            int currentW = 0;
            int d = 1;

            for(int i:weights){
                if(currentW+i>mid){
                    d++;
                    currentW = i;
                }else{
                    currentW+=i;
                }
            }
            if(d<=days){
                result = mid;
                max = mid - 1;
            }else{
                min = mid + 1;
            }
        }
    return result;
    }
}