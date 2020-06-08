package L1200_L1300.L1221;

/**
 * @BelongsProject: leet-code
 * @BelongsPackage: L1200_L1300.L1221
 * @Author: PaulDeng
 * @CreateTime: 2020-05-21 11:50
 */
public class Solution {
//    public int balancedStringSplit(String s) {
//        char[] chars = s.toCharArray();
//        int count = 0;
//        int lCount = 0;
//        int rCount = 0;
//        for (int i = 0; i < chars.length; i++) {
//            if(chars[i] == 'L'){
//                lCount++;
//            }else{
//                rCount++;
//            }
//            if(lCount==rCount&&lCount!=0){
//                count++;
//                lCount=0;
//                rCount=0;
//            }
//        }
//        return count;
//    }
    public int balancedStringSplit(String s) {
        int count = 0;
        int n = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'L'){
                n++;
            }else{
                n--;
            }
            if(n==0){
                count++;
            }
        }
        return count;
    }
}

