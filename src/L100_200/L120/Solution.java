package L100_200.L120;

import java.util.List;

/**
 * @BelongsProject: leet-code
 * @BelongsPackage: L100_200.L120
 * @Author: PaulDeng
 * @CreateTime: 2020-05-23 11:03
 */
class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int[] sum = new int[triangle.get(triangle.size()-1).size() + 1];
        for (int i = triangle.size() - 1; i >= 0; i++) {
            for (int j = 0 ; j < triangle.get(i).size(); j++) {
                sum[j] = Math.min(sum[j],sum[j+1]) + triangle.get(i).get(j);
            }
        }
        return sum[0];
    }
}