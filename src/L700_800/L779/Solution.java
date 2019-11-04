package L700_800.L779;

class Solution {
    public static int kthGrammar(int N, int K) {
        StringBuffer sb = new StringBuffer("0");
        int row = 1;
        int num = 0;
        while(row < N){
            StringBuffer sb2 = new StringBuffer();
            for (int i = 0; i < sb.length(); i++) {
                if('0' == sb.charAt(i)){
                sb2.append("01");
                }else{
                sb2.append("10");
                }
            }
            if(sb2.length() > K-1) {
                num = sb2.charAt(K - 1) - 48;
            }
            System.out.println(row+1+":"+sb2);
            sb = sb2;
            row++;
        }
        return num;
    }

    public static void main(String[] args) {
    }
}