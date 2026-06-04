class Solution {
    public int totalWaviness(int num1, int num2) {
    int waviness = 0;
        if((Math.log10(num1)+1)<3 && (Math.log10(num2)+1)<3) return waviness;
    for(int i=num1;i<=num2;i++){
       waviness+=counter(i); 
    }
        return waviness;
    }
    private int counter(int num){
    int prev = num % 10;
    num /= 10;
    int cur = num % 10;
    num /= 10;
    int ans = 0;
    
    while (num > 0) {
        int next = num % 10;
        if ((cur > prev && cur > next) || (cur < prev && cur < next))
            ans++;
        prev = cur;
        cur = next;
        num /= 10;
    }
    return ans;
}

}