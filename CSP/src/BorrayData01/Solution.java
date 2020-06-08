package BorrayData01;

/**
 * @BelongsProject: leet-code
 * @BelongsPackage: BorrayData01
 * @Author: PaulDeng
 * @CreateTime: 2020-05-26 13:34
 */
public class Solution {

        public static void main(String[] args) {
            String s1 = "Programming";
            String s2 = new String("Programming");
            String s3 = "Program" + "ming";
            System.out.println(s1 == s2);
            System.out.println(s1 == s3);
            System.out.println(s1 == s1.intern());
        }
}
