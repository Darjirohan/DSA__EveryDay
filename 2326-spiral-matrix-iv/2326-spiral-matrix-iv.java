/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[][] spiralMatrix(int m, int n, ListNode head) {
    int[][] mat = new int[m][n];

        for (int[] row : mat) {
            Arrays.fill(row, -1);
        }

        int left = 0, right = n - 1;
        int top = 0, bottom = m - 1;

        ListNode temp = head;

        while (temp != null && left <= right && top <= bottom) {
            for (int i = left; i <= right && temp != null; i++) {
                mat[top][i] = temp.val;
                temp = temp.next;
            }
            top++;
            for (int i = top; i <= bottom && temp != null; i++) {
                mat[i][right] = temp.val;
                temp = temp.next;
            }
            right--;
            for (int i = right; i >= left && temp != null && top <= bottom; i--) {
                mat[bottom][i] = temp.val;
                temp = temp.next;
            }
            bottom--;
            for (int i = bottom; i >= top && temp != null && left <= right; i--) {
                mat[i][left] = temp.val;
                temp = temp.next;
            }
            left++;
        }

        return mat;   
    }
}