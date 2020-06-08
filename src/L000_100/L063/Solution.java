package L000_100.L063;

/**
 * @BelongsProject: leet-code
 * @BelongsPackage: L000_100.L063
 * @Author: PaulDeng
 * @CreateTime: 2020-05-23 14:57
 */

// way one: dynatic progroming
class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int[][] path = new int[obstacleGrid.length][obstacleGrid[0].length];
        path[obstacleGrid.length - 1][obstacleGrid[obstacleGrid.length -1].length -1] = 1;
        for (int i = obstacleGrid.length - 1; i >= 0; i--) {
            for (int j = obstacleGrid[i].length - 1; j >= 0 ;j--) {
                if (obstacleGrid[i][j] == 0) {
                    getSum(i,j,path);
                } else {
                    path[i][j] = 0;
                }
            }
        }
        return path[0][0];
    }

    private void getSum(int i, int j, int[][] path) {
        int down = 0;
        int right = 0;
        if (i + 1 >= path.length) {
            down = 0;
        } else {
            down = path[i + 1][j];
        }
        if (j + 1 >= path[i].length) {
            right = 0;
        } else {
            right = path[i][j + 1];
        }
        path[i][j] = path[i][j] + right + down;
    }
}