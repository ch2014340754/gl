import java.util.Date;

/**
 * @creatdate 2019-06-01 16:25
 */
public class Democlass3 implements Runnable {

    static Democlass3 demo3 = new Democlass3();

    Object object1 = new Object();
    Object object2 = new Object();

    public void run() {
        synchronized (object1){
            System.out.println(Thread.currentThread().getName()+"object1开始"+new Date().getTime());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"object1结束"+new Date().getTime());
        }

        synchronized (object1){
            System.out.println(Thread.currentThread().getName()+"object2开始"+new Date().getTime());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"object2结束"+new Date().getTime());
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(demo3);
        Thread t2 = new Thread(demo3);
        t1.start();
        t2.start();
        while (t1.isAlive()||t2.isAlive()){}
        System.out.println("completed");
    }
}
