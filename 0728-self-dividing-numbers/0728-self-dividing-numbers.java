class Solution {
    public boolean bitbybit(int n){
        int original=n;
        while(n>0){
            int digit=n%10;
            if(digit==0 || (original % digit!=0)){
                return false;
            }
            n/=10;
        }
        return true;
    }
    public List<Integer> selfDividingNumbers(int left, int right) {
    List <Integer> self = new ArrayList<>();
    while(left<=right){
    if(bitbybit(left)){
        self.add(left);
    }
    left++;
    }
    return self;   
    }
}