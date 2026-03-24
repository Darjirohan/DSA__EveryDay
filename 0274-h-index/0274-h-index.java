class Solution {
    public int hIndex(int[] citations) {
    Arrays.sort(citations);
    int i=0,k=citations.length-1,h=0;
    while(k>=0){
        if(citations[k]>=i+1){
            h=i+1;
            k--;
            i++;
        }
        else{
            break;
        }
    }
    
    return h;
    }
}