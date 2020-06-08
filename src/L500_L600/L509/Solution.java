package L500_L600.L509;

/**
 * @BelongsProject: leet-code
 * @BelongsPackage: L500_L600.L509.L560
 * @Author: PaulDeng
 * @CreateTime: 2020-05-15 12:14
 */
class Solution {
    public int fib(int N) {
        int num1 = 0,num2 = 1;
        if (N <= 0) {
            return N;
        }
        for (int i = 2;i <= N; i++)
        {
            int temp = num1;
            num1 = num2;
            num2 = temp + num2;
        }
        return num2;
    }
}