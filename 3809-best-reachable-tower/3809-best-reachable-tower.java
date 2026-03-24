class Solution {
    public int[] bestTower(int[][] towers, int[] center, int radius) {
    int[] arr = new int[2];
    Arrays.fill(arr,-1);
    int man_dist = -1;
    int len= towers.length;
    for(int i=0;i<len;i++){
   int dist =(Math.abs(towers[i][0] - center[0]) +Math.abs(towers[i][1]-center[1]));
        if(dist <= radius){
            if(man_dist<towers[i][2]){
                man_dist = towers[i][2];
                arr[0] = towers[i][0];
                arr[1] = towers[i][1];
            }else if (towers[i][2] == man_dist) {
                    if (arr[0] == -1 || towers[i][0] < arr[0] || 
                       (towers[i][0] == arr[0] && towers[i][1] < arr[1])) {
                        arr[0] = towers[i][0];
                        arr[1] = towers[i][1];
                    }
                }

        }
    }
        return arr;
    }
}