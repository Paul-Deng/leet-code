package L1400_L1500.L1441;

import java.util.ArrayList;
import java.util.List;

/**
 * @BelongsProject: leet-code
 * @BelongsPackage: L1400_L1500.L1441
 * @Author: PaulDeng
 * @CreateTime: 2020-05-14 21:57
 */
public class Solution {
    public List<String> buildArray(int[] target, int n) {
        int index = 0;
        List list = new ArrayList<String>();
        for (int i = 0; i < n; i++) {
            if((i+1) == target[index]){
                list.add("Push");
                index++;
                if(index == target.length){
                    break;
                }
            }else{
                list.add("Push");
                list.add("Pop");
            }
        }
        return list;
    }
}
