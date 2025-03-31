package thread.start;

public class DemonThreadMain {
    /**
     * * 데몬 스레드
     * - 스레드는 사용자(user) 스레드와 데몬(Demon) 스레드로 구분
     *
     * ** 사용자 스레드(non-demon 스레드)
     * -> 프로그램의 주요 작업 수행
     *    작업이 완료될 때까지 실행
     *    모든 user 스레드가 종료되면 JVM 종료
     *
     * ** 데몬 스레드
     * -> 백그라운드에서 보조적인 역할 수행
     *    모든 user 스레드가 종료되면 데몬 스레드는 자동으로 종료
     *
     * !! JVM은 데몬 스레드의 실행 완료를 기다리지 않고 종료됌.
     *    데몬 스레드가 아닌 모든 스레드가 종료되면 자바 프로그램도 종료
     * */

    public static void main(String[] args) {

        System.out.println(Thread.currentThread().getName() + ": main() start") ;

        DaemonThread daemonThread = new DaemonThread();
        daemonThread.setDaemon(false);   //데몬 스레드 여부 설정  -> true이면 main()은 기다리지 않고 끝냄
        daemonThread.start();

        System.out.println(Thread.currentThread().getName() + ": main() end") ;
    }


    static class DaemonThread extends Thread{
        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName() + ": run()") ;

            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println(Thread.currentThread().getName() + ": run() end") ;
        }
    }

}
