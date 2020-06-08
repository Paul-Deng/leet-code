package HW;

import com.sun.org.apache.regexp.internal.RE;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * @BelongsProject: leet-code
 * @BelongsPackage: PACKAGE_NAME
 * @Author: PaulDeng
 * @CreateTime: 2020-05-24 21:29
 */
public class HWOD_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.valueOf(scanner.nextLine());
        if (num == 0) {
            return;
        }
        if (num == 1) {
            System.out.println(scanner.nextLine());
            return;
        }
        HashMap<String,String> hashMap = new HashMap<>();
        LinkedList<String> result = new LinkedList<>();
        LinkedList<LinkedList<String>> valLists = new LinkedList<>();
        for (int i = 0; i < num; i++) {
            String s = scanner.nextLine();
            result.add(s);
            String[] split = s.split("=");
            hashMap.put(split[0],split[1]);
            if (split[1].contains("$")) {
                LinkedList<String> valList = new LinkedList<>();
                valList.add(split[0]);
                String[] split1 = split[1].split("/");
                for (int j = 0; j < split1.length; j++) {
                    if (split1[j].contains("$")) {
                        valList.add(split1[j].substring(2,split1[j].length() - 1));
                    }
                }
                valLists.add(valList);
            }
        }
        for (int i = 0; i < valLists.size(); i++) {
            LinkedList<String> linkedList = valLists.get(i);
            String val = linkedList.get(0);
            for (int j = 1; j < linkedList.size(); j++) {
                String s = linkedList.get(j);
                String s1 = "";
                if (hashMap.containsKey(s)) {
                    s1 = hashMap.get(s);
                }
                String s2 = "";
                if (hashMap.containsKey(val)) {
                    s2 = hashMap.get(val);
                }
                String reg = "${"+s+"}";
                int i1 = s2.indexOf(reg);
                String first = s2.substring(0, i1);
                String second = s2.substring(i1+reg.length());
                String s3 = first + s1 + second;
                hashMap.put(val,s3);
            }
        }
        String str = "";
        for (int i = 0; i < valLists.size(); i++) {
            LinkedList<String> linkedList = valLists.get(i);
            String val = linkedList.get(0);
            String s = hashMap.get(val);
            if(!s.contains("$")&&s.length() > str.length()) {
                str = s;
            }
        }
        System.out.println(str);
    }
}
