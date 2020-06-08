package L1100_1200.L1143;

/**
 * @BelongsProject: leet-code
 * @BelongsPackage: L1100_1200.L1143
 * @Author: PaulDeng
 * @CreateTime: 2020-05-23 15:42
 */
// way one : recursion time out
//class Solution {
//    public int longestCommonSubsequence(String text1, String text2) {
//        char[] char1 = text1.toCharArray();
//        char[] char2 = text2.toCharArray();
//        return LCS(char1, char2, char1.length - 1, char2.length - 1);
//    }
//
//    private int LCS(char[] char1, char[] char2, int i, int j) {
//        if (j < 0 || i < 0) {
//            return 0;
//        }
//        if (char1[i] == char2[j]) {
//            return LCS(char1, char2, i-1, j-1) + 1;
//        }
//        return  Math.max(LCS(char1, char2, i - 1, j), LCS(char1, char2, i, j - 1));
//    }
//}

// way two : LCS  1.define the array's mean 2.define the base case; 3.find the
class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int[][] dp = new int[text1.length() + 1][text2.length() + 1];
        for (int i = 1; i <= text1.length(); i++) {
            for (int j = 1; j <= text2.length(); j++) {
                if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] =  Math.max(dp[i - 1][j],dp[i][j - 1]);
                }
            }
        }
        return dp[text1.length()][text2.length()];
    }
}