package thread.start;

public class HelloRunnable implements Runnable {
    /**
     * 실무에서는 implements Runnable 방식을 사용함
     * */
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + ": run()");
    }
}
