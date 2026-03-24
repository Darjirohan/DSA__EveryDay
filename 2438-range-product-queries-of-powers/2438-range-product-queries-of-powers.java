class Solution {
    public int[] productQueries(int n, int[][] queries) {
    int[] powers = new int[32];
    int index = 0;
    for(int i=0;i<32;i++){
        if(((n >> i) & 1)== 1){
        powers[index++] = 1 << i;
        }
    } 
    int[] answer = new int[queries.length];
    int MOD = 1_000_000_007;
    for(int i =0; i<queries.length;i++){
        long prod = 1;
        for(int j=queries[i][0];j<=queries[i][1];j++){
        prod = (prod * powers[j]) % MOD;
        }
        answer[i] = (int)prod;
    } 
    return answer;
    }
}