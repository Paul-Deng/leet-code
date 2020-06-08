package L200_300.L200;

/**
 * @BelongsProject: leet-code
 * @BelongsPackage: L200_300.L200
 * @Author: PaulDeng
 * @CreateTime: 2020-05-22 22:38
 */

//way one : sink island
class Solution {
    int rowN;
    int colN;

    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0){
            return 0;
        }
        int count = 0;
        rowN = grid.length;
        colN = grid[0].length;
        for (int i = 0; i < rowN; i++) {
            for (int j = 0; j < colN; j++) {
                if (grid[i][j] == '1') {
                    sinkIsland(grid,i,j);
                    count++;
                }
            }
        }
        return count;
    }

    private boolean isValid(int i, int j){
        if (i < 0 || i >= rowN || j < 0 || j >= colN) {
            return  false;
        }
        return  true;
    }

    private void sinkIsland(char[][] grid, int i, int j) {
        //terminator
        if (grid[i][j] == '0'){
            return;
        }
        //process
        grid[i][j] = '0';

        //drill down
        if (isValid(i + 1,j) &&grid[i + 1][j] == '1') {
            sinkIsland(grid,i + 1,j);
        }
        if (isValid(i - 1,j) && grid[i - 1][j] == '1') {
            sinkIsland(grid,i - 1,j);
        }
        if (isValid(i ,j + 1) && grid[i][j + 1] == '1') {
            sinkIsland(grid,i ,j + 1);
        }
        if (isValid(i,j - 1) && grid[i][j - 1] == '1') {
            sinkIsland(grid,i ,j - 1);
        }
    }
}