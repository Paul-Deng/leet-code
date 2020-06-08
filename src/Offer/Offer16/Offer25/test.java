package Offer.Offer16.Offer25;

import java.util.HashMap;
import java.util.LinkedList;

/**
 * @BelongsProject: leet-code
 * @BelongsPackage: Offer.Offer16.Offer25
 * @Author: PaulDeng
 * @CreateTime: 2020-06-06 11:37
 */
class Solution {
    private HashMap<Integer,Integer> hashMap = new HashMap<>();
    private LinkedList<Integer> list = new LinkedList<>();
    private int capacity = 0;

    public Solution(int capacity) {
        this.capacity = capacity;
    }

    public int get(int key) {
        if (hashMap.containsKey(key)) {
            list.remove((Integer) key);
            list.add(key);
            return hashMap.get(key);
        }
        return -1;
    }

    public void put(int key, int value) {
        if (list.size() >= capacity) {
            if (get(key) == -1) {
                int removeKey = list.removeFirst();
                list.add(key);
                hashMap.remove(removeKey);
                hashMap.put(key,value);
            } else {
                hashMap.put(key,value);
            }
        } else if (list.size() < capacity) {
            if (get(key) == -1) {
                hashMap.put(key,value);
                list.add(key);
            } else {
                hashMap.put(key,value);
            }
        }
    }
}

public class test{
    public static void main(String[] args) {
        Solution cache  = new Solution(2);
        cache.put(1, 1);
        cache.put(2, 2);
        System.out.println(cache.get(1));
        cache.put(3, 3);    // 该操作会使得密钥 2 作废
        System.out.println(cache.get(2));
        cache.put(4, 4);    // 该操作会使得密钥 1 作废
        System.out.println(cache.get(1));
        System.out.println(cache.get(3));
        System.out.println(cache.get(4));
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */