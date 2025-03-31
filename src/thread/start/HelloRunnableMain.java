package thread.start;

public class HelloRunnableMain {
    public static void main(String[] args) {

        System.out.println(Thread.currentThread().getName() + ": main() start") ;

        /**
         * 쓰레드와 쓰레드가 작업할 환경 분리됌
         * */
        HelloRunnable runnable = new HelloRunnable();
        Thread thread = new Thread(runnable);
        thread.start();

        System.out.println(Thread.currentThread().getName() + ": main() end") ;

    }
}
