package L000_100.l084;

import java.util.List;

/**
 * @BelongsProject: leet-code
 * @BelongsPackage: L000_100.l084
 * @Author: PaulDeng
 * @CreateTime: 2020-05-30 22:15
 */

//recursion
class Solution {
    public static int largestRectangleArea(int[] heights) {
        return getMaxArea(heights,0,heights.length - 1);
    }

    private static int getMaxArea(int[] heights, int left, int right) {
        if (left > right) {
            return 0;
        }
        int index = getMinHeight(heights, left, right);
        int area = (right - left + 1) * heights[index];
        int areaLeft = getMaxArea(heights, left, index - 1);
        int areaRight = getMaxArea(heights, index + 1, right);
        return Math.max(Math.max(areaLeft,areaRight),area);
    }

    public static int getMinHeight(int[] heights, int left, int right){
        int min = heights[left];
        int i = left;
        while (left <= right) {
            if (heights[left] < min) {
                min = heights[left];
                i = left;
            }
            left ++;
        }
        return i;
    }

    public static void main(String[] args) {
        int[] arr = {0,0,0,0,0,0,0,0,2147483647};
        System.out.println(largestRectangleArea(arr));
    }
}