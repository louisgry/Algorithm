package algo.other;

/**
 * @author Louis
 * @date Create in 2020/1/24 21:31
 */
public class SequenceIndexNumber {
    /**
     * 44-数字序列中的某一位数字
     */
    public int getDigitAtIndex(int index) {
        if (index < 0) {
            return -1;
        }
        // 1是个位，2是百位...
        int place = 1;
        while (true) {
            int amount = getAmountOfPlace(place);
            int total = amount * place;
            if (index < total) {
                return getDigitAtIndex(index, place);
            }
            index -= total;
            place++;
        }
    }

    /**
     * place位数的数字组成的字符串长度：10,90,900
     */
    private int getAmountOfPlace(int place) {
        if (place == 1) {
            return 10;
        }
        return (int) Math.pow(10, place - 1) * 9;
    }

    /**
     * place位数组成的字符串中，第index个数
     */
    private int getDigitAtIndex(int index, int place) {
        int begin = getBeginNumberOfPlace(place);
        int shift = index / place;
        String num = (begin + shift) + "";
        int count = index % place;
        return num.charAt(count) - '0';
    }

    /**
     * place位数的起始数字
     */
    private int getBeginNumberOfPlace(int place) {
        if (place == 1) {
            return 0;
        }
        return (int) Math.pow(10, place - 1);
    }

    /**
     * main
     */
    public static void main(String[] args) {
        // ==> 0
        System.out.println((new SequenceIndexNumber()).getDigitAtIndex(0));
        // ==> 1
        System.out.println((new SequenceIndexNumber()).getDigitAtIndex(13));
        // ==> 4
        System.out.println((new SequenceIndexNumber()).getDigitAtIndex(19));
    }
}
