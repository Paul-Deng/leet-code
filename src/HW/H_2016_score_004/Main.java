package HW.H_2016_score_004;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int stuNum = scanner.nextInt();
            int oprNum = scanner.nextInt();
            int[] stuScore = new int[stuNum];
            for (int i = 0; i < stuNum; i++) {
                stuScore[i] = scanner.nextInt();
            }
            for (int i = 0; i < oprNum; i++) {
                if(scanner.next().equals("Q")){
                    int left = scanner.nextInt();
                    int right = scanner.nextInt();
                    if(left > right){
                        int temp = left;
                        left = right;
                        right = temp;
                    }
                    int max = -1;
                    for (int j = left; j <= right; j++) {
                        if(stuScore[j - 1] > max){
                            max = stuScore[j - 1];
                        }
                    }
                    System.out.println(max);
                }else{
                    int id =scanner.nextInt();
                    int score = scanner.nextInt();
                    stuScore[id - 1] = score;
                }
            }
        }
    }
}
