package multithreading;

/**
 * Created by lixuanyu
 * on 2017/5/9.
 */
public class ThreadPriority implements Runnable {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new ThreadPriority());//priority 优先权，优先顺序
        Thread thread2= new Thread(new ThreadPriority());
        Thread thread3 = new Thread(new ThreadPriority());
        thread1.setName("thread1");
        thread2.setName("thread2");
        thread3.setName("thread3");
        thread1.setPriority(Thread.MIN_PRIORITY);
        thread2.setPriority(Thread.MAX_PRIORITY);
        thread3.setPriority(Thread.NORM_PRIORITY);
        thread1.start();
        thread2.start();
        thread3.start();

    }
    @Override
    public void run() {
        System.out.println("running thread:" + Thread.currentThread().getName());
        System.out.println("thread priority:" + Thread.currentThread().getPriority());
    }
}
