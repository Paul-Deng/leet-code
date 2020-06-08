package HW.H_2016_qishuiti_001;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sc;
        while(scanner.hasNext()){
            sc = scanner.nextInt();
            System.out.println(changeBottle(sc));
        }
    }

    public static int changeBottle(int bottle){
        int emptyBottle = bottle;
        int hasDrink = 0;
        int current_drink = 0;
        while(emptyBottle > 1){
            current_drink = emptyBottle / 3;
            hasDrink += current_drink;
            emptyBottle = emptyBottle % 3 + current_drink;
            if(emptyBottle == 2){
                hasDrink++;
                break;
            }
            continue;
        }
        return hasDrink;
    }
}
