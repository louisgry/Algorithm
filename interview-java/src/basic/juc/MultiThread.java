package basic.juc;

/**
 * @author Louis
 * @date Create in 2020/3/10 19:46
 */
public class MultiThread {

    private int cnt = 0;

    public static void main(String[] args) throws InterruptedException {
        /** 利用5个线程并发执行，计数10000，并打印 */
        MultiThread multiThread = new MultiThread();
        Thread thread1 = new Thread(multiThread.new MyThread());
        Thread thread2 = new Thread(multiThread.new MyThread());
        Thread thread3 = new Thread(multiThread.new MyThread());
        Thread thread4 = new Thread(multiThread.new MyThread());
        Thread thread5 = new Thread(multiThread.new MyThread());

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();

        thread1.join();
        thread2.join();
        thread3.join();
        thread4.join();
        thread5.join();

        System.out.println(multiThread.cnt);
    }

    private synchronized void add() {
        for(int i=0; i<2000; i++) {
            cnt++;
        }
    }

    private class MyThread implements Runnable {
        @Override
        public void run() {
            add();
        }
    }
}
