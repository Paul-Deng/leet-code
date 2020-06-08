package L500_L600.L504;

/**
 * @BelongsProject: leet-code
 * @BelongsPackage: L500_L600.L504
 * @Author: PaulDeng
 * @CreateTime: 2020-06-03 20:36
 */
class Solution {
    public String convertToBase7(int num) {
        StringBuilder sb = new StringBuilder();
        String res = "";
        if (num < 0) {
            res = "-";
            num = Math.abs(num);
        }
        do
        {
            sb.append(num % 7);
            num = num / 7;
        } while (num > 0);
        return res += sb.reverse().toString();
    }
}