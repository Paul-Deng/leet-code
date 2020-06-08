package L200_300.L287;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public static int findDuplicate(int[] nums) {
            int result = 0;
            int size = 0;
            Map<Integer,Integer> map = new HashMap<>();
            for (int num : nums) {
                map.put(num,0);
                if(size == map.size()){
                    result = num;
                }else{
                    size = map.size();
                }
            }
            return result;
    }

    public static void main(String[] args) {
        int[] arr = {3,1,3,4,2};
        System.out.println(findDuplicate(arr));
    }
}

interface A{

}

class B implements A{

}

class C extends B{

}