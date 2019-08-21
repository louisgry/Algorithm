package com.imooc.interview.collection;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SafeHashMapDemo {
    public static void main(String[] args) {
        Map hashMap = new HashMap();
        Map safeHashMap = Collections.synchronizedMap(hashMap);
        safeHashMap.put("aa", "1");
        safeHashMap.put("bb", "2");
        System.out.println(safeHashMap.get("bb"));
    }
}
