package L000_100.L062;

/**
 * @BelongsProject: leet-code
 * @BelongsPackage: L000_100.L062
 * @Author: PaulDeng
 * @CreateTime: 2020-05-23 09:36
 */
class Solution {
    public int uniquePaths(int m, int n) {
        int[][] count = new int [m][n];
        count[m - 1][n - 1] = 1;
        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                getSum(count,i,j);
            }
        }
        return count[0][0];
    }

    private void getSum(int[][] count, int i, int j) {
        int right = 0;
        int down = 0;
        if (i + 1 >= count.length) {
            down = 0;
        } else {
            down = count[i + 1][j];
        }
        if (j + 1 >= count[0].length) {
            right = 0;
        } else {
            right = count[i][j + 1];
        }
        count[i][j] = count[i][j] + right + down;
    }
}
