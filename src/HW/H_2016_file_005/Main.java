package HW.H_2016_file_005;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> stringIntegerHashMap = null;
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            stringIntegerHashMap = new HashMap<>();
            String str = scanner.next();
            String[] split = str.split("\\\\");
            String s;
            if(split.length == 0){
                s = str;
            }else{
                s = split[split.length-1];
            }
            Integer integer = stringIntegerHashMap.get(s);
            if(integer == null) {
                stringIntegerHashMap.put(s,1);
            }else{
                stringIntegerHashMap.put(s,Integer.valueOf(integer + 1));
            }
        }
    }
}
