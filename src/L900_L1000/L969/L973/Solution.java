package L900_L1000.L969.L973;

class Solution {
    public static int[][] kClosest(int[][] points, int K) {
        int[][] ans =  new int[K][2];
        long[] arr = new long[K];
        for (int i = 0; i < K; i++) {
            arr[i] = Integer.MAX_VALUE;
        }
        int location = 0;
        for(int[] point : points){
            location = findMax(arr);
            if(point[0]*point[0] + point[1]*point[1] < arr[location]){
                arr[location] = point[0]*point[0] + point[1]*point[1];
                ans[location][0] = point[0];
                ans[location][1] = point[1];
            }
        }
        return ans;
    }

    public static int findMax(long[] arr) {
        long max = 0;
        int flag = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                flag = i;
            }
        }
        return flag;
    }

    public static void showArray(int[][] arr){
        for (int[] a:arr) {
            int b = a[0];
            int c = a[1];
            System.out.println("["+b+","+c+"]");
            }
    }

    public static void main(String[] args) {
        int[][] points = {{-5,4},{-6,-5},{4,6}};
        showArray(kClosest(points,2));
    }
}