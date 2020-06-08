package Offer.Offer40;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @BelongsProject: leet-code
 * @BelongsPackage: Offer.Offer40
 * @Author: PaulDeng
 * @CreateTime: 2020-05-24 20:49
 */
class Solution {
    public static int[] getLeastNumbers(int[] arr, int k) {
        if (k <= 0) {
            return new int[k];
        }
        Queue<Integer> queue = new PriorityQueue<>((v1,v2) -> v2 - v1);
        for (int num: arr) {
            if (queue.size() < k) {
                queue.offer(num);
            } else if (queue.peek() > num) {
                queue.poll();
                queue.offer(num);
            }
        }
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = queue.poll();
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {0,1,2,1};
        for (int num : getLeastNumbers(arr,0)) {
            System.out.println(num);
        }
    }
}