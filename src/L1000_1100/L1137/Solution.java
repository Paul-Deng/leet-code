package L1000_1100.L1137;

class Solution {
    public static int tribonacci(int n) {
        int[] array = new int[38];
        array[0] = 0;
        array[1] = 1;
        array[2] = 1;
        int index = 3;
        while(index <= n){
            array[index] = array[index-1] + array[index -2] + array[index -3];
            index++;
        }
        return array[n];
    }

    public static void main(String[] args) {
        System.out.println(tribonacci(37));
    }
}