import java.util.concurrent.CountDownLatch;

/**
 * @author jiafengjie
 * @date $date$ $time$
 * @Description
 */
public class jia {
    /**
     * @Title: jia
     * @Package
     * @Description:
     * @author ceshi
     * @date 2018/5/2516:47
     */

    public static void main(String[] args) {

        new Thread(){
            public void run() {
                try {
                    System.out.println("子线程"+Thread.currentThread().getName()+"正在执行");
                    Thread.sleep(3000);
                    System.out.println("子线程"+Thread.currentThread().getName()+"执行完毕");

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            };
        }.start();

        new Thread(){
            public void run() {
                try {
                    System.out.println("子线程"+Thread.currentThread().getName()+"正在执行");
                    Thread.sleep(1000);
                    System.out.println("子线程"+Thread.currentThread().getName()+"执行完毕");

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            };
        }.start();

        try {
            System.out.println("等待2个子线程执行完毕...");

            System.out.println("2个子线程已经执行完毕");
            System.out.println("继续执行主线程");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
