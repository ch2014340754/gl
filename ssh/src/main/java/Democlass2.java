/**
 * @creatdate 2019-06-01 16:07
 */
public class Democlass2 implements Runnable {

   static Democlass2 demo1 = new Democlass2();

    public static void main(String[] args) {
      Thread t1 = new Thread(demo1);
      Thread t2 = new Thread(demo1);
      t1.start();
      t2.start();
    while (t1.isAlive()||t2.isAlive()){

    }
      System.out.println( "finished");
    }


    public synchronized void  run() {
        System.out.println(Thread.currentThread().getName()+"开始了");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+"结束了");
    }
}
