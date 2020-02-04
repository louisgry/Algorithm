package ds.string;

/**
 * @author Louis
 * @date Create in 2019/12/22 15:54
 */
public class PrintFromOneToN {
    /**
     * 17-打印从1到最大的n位数
     */
    public void Print1ToMaxOfNDigits(int n) {
        if(n <= 0) {
            return;
        }
        StringBuilder num = new StringBuilder(n);
        for(int i=0; i<n; i++) {
            num.append('0');
        }
        while(increment(num)) {
            String res = num.toString().replaceFirst("^0*", "");
            System.out.println(res);
        }
    }
    private boolean increment(StringBuilder str) {
        for(int i=str.length()-1; i>=0; i--) {
            if(str.charAt(i)>='0' && str.charAt(i)<'9') {
                str.setCharAt(i, (char) (str.charAt(i)+1));
                return true;
            }
            else if(str.charAt(i) == '9') {
                str.setCharAt(i, '0');
            }
            else {
                return false;
            }
        }
        return false;
    }

    /** main */
    public static void main(String[] args) {
        (new PrintFromOneToN()).Print1ToMaxOfNDigits(3);
    }
}
