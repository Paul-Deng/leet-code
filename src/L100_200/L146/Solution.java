package L100_200.L146;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * @BelongsProject: leet-code
 * @BelongsPackage: L100_200.L146
 * @Author: PaulDeng
 * @CreateTime: 2020-05-21 19:22
 */
//class LRUCache {
//
//    private HashMap<Integer,Integer> hashMap;
//
//    private LinkedList<Integer> linkedList;
//
//    private int capacity;
//
//    public LRUCache(int capacity) {
//        hashMap = new HashMap<>();
//        linkedList = new LinkedList<>();
//        this.capacity = capacity;
//    }
//
//    public int get(int key) {
//        if(!hashMap.containsKey(key)){
//            return -1;
//        }
//        linkedList.remove(Integer.valueOf(key));
//        linkedList.addLast(key);
//        return hashMap.get(key);
//    }
//
//    public void put(int key, int value) {
//        if(hashMap.containsKey(key)){
//            linkedList.remove(Integer.valueOf(key));
//            linkedList.addLast(key);
//            hashMap.put(key,value);
//            return;
//        }
//        if(linkedList.size()==capacity){
//            Integer integer = linkedList.removeFirst();
//            hashMap.remove(integer);
//        }
//        hashMap.put(key,value);
//        linkedList.addLast(key);
//    }
//}
class LRUCache {
    private LinkedHashMap<Integer,Integer> linkedHashMap;

    public LRUCache(int capacity) {
        linkedHashMap = new LinkedHashMap<Integer, Integer>(capacity,0.75f,true){
            @Override
            protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
                return linkedHashMap.size() > capacity;
            }
        };
    }

    public int get(int key) {
        return linkedHashMap.getOrDefault(key,-1);
    }

    public void put(int key, int value) {
        linkedHashMap.put(key,value);
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */


public class Solution{
    public static void main(String[] args) {
        LRUCache cache = new LRUCache( 2 /* 缓存容量 */ );

        cache.put(1, 1);
        cache.put(2, 2);
        cache.get(1);       // 返回  1
        cache.put(3, 3);    // 该操作会使得密钥 2 作废
        cache.get(2);       // 返回 -1 (未找到)
        cache.put(4, 4);    // 该操作会使得密钥 1 作废
        cache.get(1);       // 返回 -1 (未找到)
        cache.get(3);       // 返回  3
        cache.get(4);       // 返回  4
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */