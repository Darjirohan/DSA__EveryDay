class Solution {
    public int countEven(int num) {
        
        int count = 0;

        for(int i=1;i<=num;i++){
            int orig = i;
            int sum = 0;
            while(orig!=0){
            sum+=orig%10;
            orig/=10;
            }
            if(sum%2==0) count++;
        }
        return count;
    }
}