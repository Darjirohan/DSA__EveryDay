class Solution {
    public int[] arrayRankTransform(int[] arr) {
        
        int n = arr.length;
        if(n<=0) return arr;
        int[] map = new int[n];

        for(int i=0;i<n;i++){
        map[i] = arr[i];
        }
        Arrays.sort(arr);
        HashMap<Integer,Integer> mp = new HashMap<>();
        int i=1;
        mp.put(arr[0],1);
        for(int j=1;j<n;j++){
        if(arr[j]!=arr[j-1]){
            i++;
            mp.put(arr[j],i);
        }
        }
        
        for(int j=0;j<n;j++){
            arr[j] = mp.get(map[j]);
        }
        return arr;
    }
}