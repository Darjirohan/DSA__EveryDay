import java.util.*;
class Solution {
    static List<Integer> generateRow(int row){
        ArrayList <Integer> ls = new ArrayList <>();
        int ans=1;
        ls.add(1);
        for(int col=1;col<row;col++){
            ans = ans*(row - col);
            ans = ans/col;
            ls.add(ans);
        }
        return ls;
    }
    public List<List<Integer>> generate(int numRows) {
    List<List<Integer>> ls = new ArrayList<>();
    for(int i=1;i<=numRows;i++){
    ls.add(generateRow(i));
    }
    return ls;
    }
}