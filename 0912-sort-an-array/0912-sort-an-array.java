class Solution {
    public int[] sortArray(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)-> a-b);

        int n = nums.length;

        for(int i:nums){
            pq.add(i);
        }
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = pq.poll();
        }

        return arr;
    }
}