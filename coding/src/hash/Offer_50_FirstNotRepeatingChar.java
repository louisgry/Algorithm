package hash;

/**
 * @author Louis
 * @date Create in 2020/7/11 23:35
 */
public class Offer_50_FirstNotRepeatingChar {
    /** 50-第一个只出现一次的字符 */
    public int FirstNotRepeatingChar(String str) {
        int[] hash = new int[256];
        // 统计出现的次数
        for(int i=0; i<str.length(); i++) {
            hash[str.charAt(i)]++;
        }
        // 返回第一个出现一次的字符
        for(int i=0; i<str.length(); i++) {
            if(hash[str.charAt(i)] == 1) {
                // 返回出现的位置
                return i;
            }
        }
        // 未找到返回-1
        return -1;
    }
    /** main */
    public static void main(String[] args) {
        String str = "abcab";
        System.out.println((new Offer_50_FirstNotRepeatingChar()).FirstNotRepeatingChar(str));
    }
}
