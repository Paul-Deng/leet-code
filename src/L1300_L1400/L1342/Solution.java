package L1300_L1400.L1342;

/**
 * @BelongsProject: leet-code
 * @BelongsPackage: L1300_L1400.L1342
 * @Author: PaulDeng
 * @CreateTime: 2020-05-22 08:15
 */
// way one > 1.while 2.if then /2 else -1
// way two > 1.while 2.if then bit operation else -1
// minus number can via number(binary) -1 and  inversion (equal to & -2)
public class Solution  {
    public int numberOfSteps (int num) {
        int count = 0;
        while (num > 0) {
            count ++;
            num =  (num & 1) == 1 ? (num & -2) : (num >>>= 1);
        }
        return count;
    }
}
