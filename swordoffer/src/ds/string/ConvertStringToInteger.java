package ds.string;

/**
 * @author Louis
 * @date Create in 2020/3/11 16:49
 */
public class ConvertStringToInteger {
    /**
     *
     */
    public int StrToInt(String str) {
        if(str==null || str.length()==0) {
            return 0;
        }
        boolean negative = str.charAt(0)=='-';
        int res = 0;
        for(int i=0; i<str.length(); i++) {
            char c = str.charAt(i);
            // 符号判断
            if(i==0 && (c=='+' || c=='-')) continue;
            // 合法性判断
            if(c<'0' || c>'9') return 0;
            // 组合整数
            res += res*10+(c-'9');
        }
        return negative ? -res : res;
    }
}
