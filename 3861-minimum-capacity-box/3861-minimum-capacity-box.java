class Solution {
    public int minimumIndex(int[] capacity, int itemSize) {

        int minIndex = -1;
        int minNumber = Integer.MAX_VALUE;

        for(int i=0;i<capacity.length;i++){
            if(capacity[i]>=itemSize && minNumber>capacity[i]){
                    minNumber = capacity[i];
                    minIndex = i;
            }
        }
        
        return (minIndex == Integer.MAX_VALUE)?-1:minIndex;
    }
}