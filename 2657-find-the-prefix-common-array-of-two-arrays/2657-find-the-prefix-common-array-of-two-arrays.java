class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
    
    int n = A.length;
    int[] ans = new int[n];
    HashMap<Integer,Integer> mp = new HashMap<>();

    for(int i=0;i<n;i++){
      mp.put(A[i],mp.getOrDefault(A[i],0)+1);
      mp.put(B[i],mp.getOrDefault(B[i],0)+1);
      int count = 0;
      for(int j:mp.values()){
        if(j==2) count++;
      }
      ans[i] = count;
    }
    return ans;
    }
}