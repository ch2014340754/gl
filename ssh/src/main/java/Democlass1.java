/**
 * @creatdate 2019-06-01 15:25
 */
public class Democlass1 implements Runnable {

    static Democlass1 demo1 = new Democlass1();
    static int t = 0;
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(demo1);
        Thread t2 = new Thread(demo1);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(t);

    }

    public void run() {
        for (int i = 0; i < 10000; i++) {
            t++;
        }
    }
}
