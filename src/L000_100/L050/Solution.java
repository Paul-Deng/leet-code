package L000_100.L050;

/**
 * @BelongsProject: leet-code
 * @BelongsPackage: L000_100.L050
 * @Author: PaulDeng
 * @CreateTime: 2020-05-22 16:56
 */
class Solution {
    public double myPow(double x, int n) {
        return n >= 0? getResult(x,n) : 1.0 / getResult(x,-n);
    }

    private double getResult(double x, int i) {
        if(i == 0){
            return 1.0;
        }
        double y = getResult(x,i/2);
        return i % 2 == 0 ? y * y : y * y *x;
    }
}
