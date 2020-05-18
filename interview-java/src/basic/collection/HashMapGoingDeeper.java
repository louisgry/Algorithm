package basic.collection;

import java.util.HashMap;
import java.util.Hashtable;

/**
 * @author Louis
 * @date Create in 2020/3/3 12:53
 */
public class HashMapGoingDeeper {
    public static void fun() {
        System.out.println("get");
    }
    /**
     * HashMap 源码深入
     */
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        Hashtable<Integer, Integer> table = new Hashtable<>();

        /** 查看map里面的元素是不是只有16个 */
//        for(int i=0; i<100; i++) {
//            map.put(i, i);
//        }
//        System.out.println(map);

        /** kv是否可以为null */
//        map.put(null, null);
//        System.out.println(map.get(null));
//        try{
//            table.put(null, null);
//            System.out.println(table.get(null));
//        } catch (Exception e) {
//            System.out.println("error");
//        }

        /** indexFor = hash & (n-1) 相等于 取模操作*/
//        System.out.println(100 & (16-1));
//        System.out.println(100 % 16);

        /** 扩容重新计算桶下标 */
        // 第五位为0：101111，桶位置和原来一致
        int hash = 15+32;
        System.out.println(hash & (16-1));
        System.out.println(hash & (32-1));
        // 第五位为1：11111，桶位置是原来的位置+n
        int hash1 = 15+16;
        System.out.println(hash1 & (16-1));
        System.out.println(hash1 & (32-1));
    }
}
