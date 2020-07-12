package bfs;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

/**
 * @author Louis
 * @date Create in 2020/7/12 21:46
 */
public class LeetCode_752_OpenLock {
    /** 752-打开转盘锁 */
    public int openLock(String[] deadends, String target) {
        // 死亡密码
        Set<String> deads = new HashSet<>();
        for(String str : deadends) {
            deads.add(str);
        }
        // 记录已访问过的
        Set<String> visited = new HashSet<>();
        // BFS搜索
        Queue<String> queue = new LinkedList<>();
        queue.add("0000");
        visited.add("0000");
        int step = 0;
        while(!queue.isEmpty()) {
            int size = queue.size();
            for(int i=0; i<size; i++) {
                String cur = queue.poll();
                // 判断是否到达终点：正确或死亡
                if(deads.contains(cur)) {
                    continue;
                }
                if(target.equals(cur)) {
                    return step;
                }
                // 把未遍历的相邻节点加入队列
                for(int j=0; j<4; j++) {
                    String up = plusOne(cur, j);
                    if(!visited.contains(up)) {
                        queue.add(up);
                        visited.add(up);
                    }
                    String down = minusOne(cur, j);
                    if(!visited.contains(down)) {
                        queue.add(down);
                        visited.add(down);
                    }
                }
            }
            step++;
        }
        return -1;
    }
    private String plusOne(String str, int j) {
        char[] ch = str.toCharArray();
        if(ch[j] == '9') {
            ch[j] = '0';
        }
        else {
            ch[j] += 1;
        }
        return new String(ch);
    }
    private String minusOne(String str, int j) {
        char[] ch = str.toCharArray();
        if(ch[j] == '0') {
            ch[j] = '9';
        }
        else {
            ch[j] -= 1;
        }
        return new String(ch);
    }
    /** main */
    public static void main(String[] args) {
        String[] deadends = {"8888"};
        String target = "0009";
        System.out.println((new LeetCode_752_OpenLock()).openLock(deadends, target));
    }
}
