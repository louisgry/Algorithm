package ds.queue;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Louis
 * @date Create in 2020/1/22 23:45
 */
public class NotRepeatCharacter {
    /**
     * 41.2-字符流中第一个不重复的字符
     * - https://www.nowcoder.com/practice/00de97733b8e4f97a3fb5c680ee10720
     */
    private int[] hash = new int[256];
    private Queue<Character> queue = new LinkedList<>();
    //Insert one char from stringstream
    public void Insert(char ch) {
        hash[ch]++;
        queue.add(ch);
        // 重复的字符出队
        while(!queue.isEmpty() && hash[queue.peek()]>1) {
            queue.poll();
        }
    }
    //return the first appearence once char in current stringstream
    public char FirstAppearingOnce() {
        if(queue.isEmpty()) {
            return '#';
        }
        else {
            return queue.peek();
        }
    }
}
