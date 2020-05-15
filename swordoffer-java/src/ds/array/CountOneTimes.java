package ds.array;

/**
 * @author Louis
 * @date Create in 2020/1/23 22:24
 */
public class CountOneTimes {
    /**
     * 43-从1到n整数中1出现的次数
     * - https://www.nowcoder.com/practice/bd7f978302044eee894445e244c7eee6
     */
    public int NumberOf1Between1AndN_Solution(int n) {
        int count = 0;
        for(int i=1; i<=n; i*=10) {
            // 高位a，低位b
            int a = n/i, b = n%i;
            // 加8处理：当百位为0，则a/10==(a+8)/10，当百位>=2，补8会产生进位位，效果等同于(a/10+1)
            count += (a+8)/10*i;
            // b+1处理：当百位对应0或>=2时，有(a+8)/10次包含所有100个点，还有当百位为1(a%10==1)
            if(a%10 == 1) {
                count += b+1;
            }
        }
        return count;
    }
    /** main */
    public static void main(String[] args) {
        System.out.println((new CountOneTimes()).NumberOf1Between1AndN_Solution(216));
    }
}
