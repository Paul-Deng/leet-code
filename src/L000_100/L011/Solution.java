package L000_100.L011;

/**
 * @BelongsProject: leet-code
 * @BelongsPackage: L000_100.L11
 * @Author: PaulDeng
 * @CreateTime: 2020-05-22 00:05
 */
public class Solution {
    public int maxArea(int[] height) {
        int maxArea = 0;
        for (int i = 0,j = height.length -1 ; i < j;) {
            int h = height[i] > height[j] ? height[j--]:height[i++];
            int area = (j - i + 1) * h;
            maxArea = Math.max(maxArea,area);
        }
        return maxArea;
    }
}
