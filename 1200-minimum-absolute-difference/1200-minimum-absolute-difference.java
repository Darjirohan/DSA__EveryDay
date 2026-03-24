class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
    Arrays.sort(arr);
    List<List<Integer>> ls = new ArrayList<>();
    if(arr.length == 2){
        ls.add(Arrays.asList(arr[0],arr[1]));
    }else{
    int min_diff = Integer.MAX_VALUE;
    for(int i=0;i<arr.length-1;i++){
        int diff = Math.abs(arr[i] - arr[i+1]);
        min_diff = (min_diff>diff)?diff:min_diff;
    }  
    for(int i=0;i<arr.length-1;i++){
        int diff = Math.abs(arr[i] - arr[i+1]);
        if(diff == min_diff){
            ls.add(Arrays.asList(arr[i],arr[i+1]));
        }
    }
    }
    return ls;
    }
}