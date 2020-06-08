package HW;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * @BelongsProject: leet-code
 * @BelongsPackage: PACKAGE_NAME
 * @Author: PaulDeng
 * @CreateTime: 2020-05-24 21:40
 */
public class HWOD_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] split = s.split("@");
        if(split.length == 1) {
            System.out.println(split[0]+"@");
            return;
        }
        HashMap<String,Integer> hashMapPre = new HashMap<>();
        HashMap<String,Integer> hashMapPost = new HashMap<>();

        String preStr = split[0];
        String postStr = split[1];

        String[] split_1 = preStr.split(",");
        String[] split_2 = postStr.split(",");

        LinkedList<String> linkedList = new LinkedList<>();
        for (String str : split_1) {
            String[] split2 = str.split(":");
            linkedList.add(split2[0]);
            hashMapPre.put(split2[0],Integer.valueOf(split2[1]));
        }
        for (String str: split_2) {
            String[] split2 = str.split(":");
            hashMapPost.put(split2[0],Integer.valueOf(split2[1]));
        }
        String result = "";
        for (int i = 0; i < linkedList.size(); i++) {
            String s1 = linkedList.get(i);
            Integer int1 = hashMapPre.get(s1);
            int int2 = 0;
            if (hashMapPost.containsKey(s1)) {
                int2 = hashMapPost.get(linkedList.get(i));
            }
            if (int1 - int2 != 0) {
                if(i != linkedList.size() - 1) {
                    result += linkedList.get(i) + ":" + (int1 - int2) + ",";
                } else {
                    result +=linkedList.get(i) + ":" + (int1 - int2);
                }
            }
        }
        if (result.equals(split[0])) {
            result += "@";
        }
        System.out.println(result);
    }
}
