package L000_100.L043;

import java.util.*;

/**
 * @BelongsProject: leet-code
 * @BelongsPackage: L000_100.L043
 * @Author: PaulDeng
 * @CreateTime: 2020-06-06 07:30
 */
//class Solution {
//    public String multiply(String num1, String num2) {
//
//        }
//    }
//}
class Solution {
    public static void main(String[] args) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(5,(x,y) -> x - y);
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            int temp = random.nextInt(100);
            System.out.println("是否含有:" + temp + ":" + minHeap.contains(temp));
            if (minHeap.size() == 5) {
                if (!minHeap.contains(temp) && (minHeap.peek() < temp)) {
                    minHeap.poll();
                    minHeap.offer(temp);
                }
            } else if (minHeap.size() < 5) {
                if (!minHeap.contains(temp)) {
                    minHeap.offer(temp);
                }
            }

            minHeap.stream().map(x -> x+":").forEach(System.out::print);
        }
    }
}