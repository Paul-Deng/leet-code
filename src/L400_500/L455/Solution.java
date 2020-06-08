package L400_500.L455;

import java.util.Arrays;

/**
 * @BelongsProject: leet-code
 * @BelongsPackage: L400_500.L455
 * @Author: PaulDeng
 * @CreateTime: 2020-05-21 15:17
 */
public class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int count = 0;
        for (int i = 0; i < s.length; i++) {
            if(s[i] >= g[count]){
                count++;
            }
            if(count == g.length){
                break;
            }
        }
        return count;
    }
}
