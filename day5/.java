package day5;

import java.util.*;

class Solution {
    public int orangesRotting(int[][] grid) {

        Queue<int[]> q = new LinkedList<>();

        int fresh = 0;
        int time = 0;

        int n = grid.length;
        int m = grid[0].length;

        // Count fresh oranges and store all rotten oranges
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                if (grid[i][j] == 2)
                    q.offer(new int[]{i, j});

                else if (grid[i][j] == 1)
                    fresh++;
            }
        }
        return fresh == 0 ? time : -1;
    }

}