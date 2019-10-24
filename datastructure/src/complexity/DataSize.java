package complexity;

/**
 * 2-2：对数据规模有一个概念
 */
public class DataSize {

    public static void main(String[] args) {
        // 10^1到10^9内的求和
        for(int x=1; x<10; x++){
            int n = (int) Math.pow(10, x);
            long startTime = System.currentTimeMillis();
            long sum = 0;
            for(int i=0; i<n; i++){
                sum += i;
            }
            long endTime = System.currentTimeMillis();

//            System.out.println("sum = " + sum);
            System.out.println("10^" + x + " : " + (endTime-startTime)+" ms");
//            System.out.println();

        }
    }
}
