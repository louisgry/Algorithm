package ds.hash;

/**
 * @author Louis
 * @date Create in 2020/2/20 10:35
 */
public class FirstChar {
    /**
     * 50-第一个只出现一次的字符
     * - https://www.nowcoder.com/practice/1c82e8cf713b4bbeb2a5b31cf5b0417c
     */
    public int FirstNotRepeatingChar(String str) {
        int[] hash = new int[256];
        // 优化计算频率：数组
        for (int i = 0; i < str.length(); i++) {
            hash[str.charAt(i)]++;
        }
        // 找第一个频率为1的字符
        for (int i = 0; i < str.length(); i++) {
            if (hash[str.charAt(i)] == 1) {
                return i;
            }
        }
        return -1;
    }
}
