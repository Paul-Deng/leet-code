package L1200_L1300;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Leaderboard {

    Map<Integer,Integer> map = null;
    int[] arr = null;
    public Leaderboard() {
        map = new HashMap<>();
    }

    public void addScore(int playerId, int score) {
        if(!map.containsKey(playerId)){
            map.put(playerId,score);
        }else{
            Integer sc = map.get(playerId);
            Integer integer = score + sc;
            map.put(playerId,integer);
        }
    }

    public int top(int K) {
        arr = new int[K];
        int result = 0;
        for (Integer value : map.values()) {
            if(value > arr[K-1]){
                arr[K-1] = value;
                int insertIndex = K - 2;
                int insertVal = arr[K-1];
                while(insertIndex >= 0 && insertVal > arr[insertIndex]){
                    arr[insertIndex+1] = arr[insertIndex];
                    insertIndex--;
                }
                arr[insertIndex+1] = insertVal;
            }
        }
        for (int i = 0; i < K; i++) {
            result += arr[i];
        }
        return result;
    }

    public void reset(int playerId) {
        map.put(playerId,0);
    }

    public void showMap(){
        for (Map.Entry<Integer,Integer> entry : map.entrySet()){
            System.out.print(entry.getKey()+":"+entry.getValue()+"->");
        }
        System.out.println();
        Arrays.toString(arr);
    }

    public void insertVal(int[] arr, int val){
    }

    public static void main(String[] args) {
        Leaderboard leaderboard = new Leaderboard ();
        leaderboard.addScore(1,73);   // leaderboard = [[1,73]];
        leaderboard.showMap();
        leaderboard.addScore(2,56);   // leaderboard = [[1,73],[2,56]];
        leaderboard.showMap();
        leaderboard.addScore(3,39);   // leaderboard = [[1,73],[2,56],[3,39]];
        leaderboard.showMap();
        leaderboard.addScore(4,51);   // leaderboard = [[1,73],[2,56],[3,39],[4,51]];
        leaderboard.showMap();
        leaderboard.addScore(5,4);    // leaderboard = [[1,73],[2,56],[3,39],[4,51],[5,4]];
        leaderboard.showMap();
        System.out.println(leaderboard.top(1));
        leaderboard.reset(1);         // leaderboard = [[2,56],[3,39],[4,51],[5,4]];
        leaderboard.showMap();
        leaderboard.reset(2);         // leaderboard = [[3,39],[4,51],[5,4]];
        leaderboard.showMap();
        leaderboard.addScore(2,51);   // leaderboard = [[2,51],[3,39],[4,51],[5,4]];
        leaderboard.showMap();
        System.out.println(leaderboard.top(3));
    }
}

/**
 * Your Leaderboard object will be instantiated and called as such:
 * Leaderboard obj = new Leaderboard();
 * obj.addScore(playerId,score);
 * int param_2 = obj.top(K);
 * obj.reset(playerId);
 */
