package L000_100.L022;

import javax.lang.model.element.ElementKind;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @BelongsProject: leet-code
 * @BelongsPackage: L000_100.L022
 * @Author: PaulDeng
 * @CreateTime: 2020-05-22 14:47
 */

////way one : recursion
class Solution {
    List<String> list = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        generate(0,0,n,"");
        return list;
    }

    private void generate(int left, int right, int n, String s) {
        //terminal
        if (left == right && left == n) {
            list.add(s);
            return;
        }
        //process
        if (left < n) {
            generate(left + 1,right , n,s+"(");
        }
        if(right < left){
            generate(left, right + 1, n, s+")");
        }
    }
}

