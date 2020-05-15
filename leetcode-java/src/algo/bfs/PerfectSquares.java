package algo.bfs;

import javafx.util.Pair;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Louis
 * @date Create in 2019/10/24 10:43
 */
public class PerfectSquares {

    public int numSquares(int n) {
        // BFS求无权图中n到0的最短路径问题：node是数字，edge为是否相差一个完全平方数
        // 声明队列<num, step>，先入队<数字：n, 步数：0>
        // 声明BFS的visited数组(0到n个)。最后一个数字n设为已访问
        // 当队列不为空时，while循环
        // -- 取出队首，若num为0，return step
        // -- for循环，i从1开始自增，当num-i*i>=0
        // ---- 如果num-i*i没有被访问过，入队，step+1。且visited设为true

        Queue<Pair<Integer, Integer>> queue = new LinkedList<Pair<Integer, Integer>>();
        boolean[] visited = new boolean[n+1];
        queue.add(new Pair(n, 0));
        visited[n] = true;
        while(!queue.isEmpty()) {
            Pair<Integer, Integer> front = queue.poll();
            int num = front.getKey();
            int step = front.getValue();
            if(num == 0) {
                return step;
            }
            for(int i=0; num-i*i>=0; i++) {
                if(!visited[num-i*i]) {
                    queue.add(new Pair(num-i*i, step+1));
                    visited[num-i*i] = true;
                }
            }
        }
        throw new IllegalStateException("no solution");
    }
}
