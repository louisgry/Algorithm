package basic.juc;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author Louis
 * @date Create in 2020/2/17 23:34
 */
public class FinalizerDemo {

    static AtomicInteger aliveCount = new AtomicInteger(0);

    FinalizerDemo() {
        aliveCount.incrementAndGet();
    }

    /**
     * 重写finalize()方法：但是去掉之后，GC正常了
     * @throws Throwable
     */
    @Override
    protected void finalize() throws Throwable {
        FinalizerDemo.aliveCount.decrementAndGet();
    }

    public static void main(String args[]) {
        for (int i = 0;; i++) {
            FinalizerDemo f = new FinalizerDemo();
            if ((i % 100_000) == 0) {
                System.out.format("After creating %d objects, %d are still alive.%n",
                        new Object[] {i, FinalizerDemo.aliveCount.get() });
            }
        }
    }
}
