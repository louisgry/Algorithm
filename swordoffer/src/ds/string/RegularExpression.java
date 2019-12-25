package ds.string;

/**
 * @author Louis
 * @date Create in 2019/12/25 20:46
 */
public class RegularExpression {
    /**
     * 19-正则表达式匹配
     * https://www.nowcoder.com/practice/45327ae22b7b413ea21df13ee7d6429c
     */
    public boolean match(char[] str, char[] pattern) {
        if(str==null || pattern==null) {
            return false;
        }
        return matchCore(str, pattern, 0, 0);
    }
    private boolean matchCore(char[] str, char[] pattern, int s, int p) {
        // 两个都到尾，则成功
        if(s==str.length && p==pattern.length) {
            return true;
        }
        // pattern先到尾，则失败
        if(s!=str.length && p==pattern.length) {
            return false;
        }
        // pattern下一个是*
        // 时刻注意判断是否越界
        if(p+1<pattern.length && pattern[p+1]=='*') {
            // 匹配，则str后移1位
            if(s!=str.length && (str[s]==pattern[p] || pattern[p]=='.')) {
                return matchCore(str, pattern, s+1, p)
                        || matchCore(str, pattern, s, p+2);
            }
            // 不匹配，pattern后移2位，跳过*
            else {
                return matchCore(str, pattern, s, p+2);
            }
        }
        // pattern下一个不是*，且匹配，则str和pattern都后移1位
        if(s!=str.length && (str[s]==pattern[p] || pattern[p]=='.')) {
            return matchCore(str, pattern, s+1, p+1);
        }
        return false;
    }
    /** main */
    public static void main(String[] args) {
        System.out.println((new RegularExpression()).match(new char[]{'a','a','a'}, new char[]{'a','*','a'}));
        System.out.println((new RegularExpression()).match(new char[]{'a','a','a'}, new char[]{'a','b','*','a','c','*','a'}));
    }
}
