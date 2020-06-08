package HW.H_2016_16jinzhi_003;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            String str = scanner.next();
            String substring = str.substring(2);
            char[] chars = substring.toCharArray();
            BigDecimal bigDecimal = new BigDecimal(0);
            BigDecimal b16 = new BigDecimal(16);
            for (int i = 0; i < chars.length; i++) {
                if(chars[i] >= 'A'){
                    BigDecimal subtract = new BigDecimal(chars[i]).subtract(new BigDecimal(55));
                    BigDecimal result = subtract.multiply(b16.pow(chars.length - i - 1));
                    bigDecimal = bigDecimal.add(result);
                }else{
                    BigDecimal subtract = new BigDecimal(chars[i]).subtract(new BigDecimal(48));
                    BigDecimal result = subtract.multiply(b16.pow(chars.length - i - 1));
                    bigDecimal = bigDecimal.add(result);
                }
            }
            System.out.println(bigDecimal);
        }

    }
}
