package thread.start;

public class BadThreadMain {
    public static void main(String[] args) {

        System.out.println(Thread.currentThread().getName() + ": main() start");
        HelloThread helloThread = new HelloThread();
        System.out.println(Thread.currentThread().getName() + ": start() 호출 전");
        /**
         * helloThread가 아닌, main이 직접 run() 실행함.
         * main 스레드 스택에 run()이 들어감. (Thread-0 스레드는 물론, 스택 또한 생성 안됌)
         * => 결과적으로 main 스레드에서 모든 것을 처리함.
         * => * main 스레드가 아닌 별도의 스레드에서 재정의한 run()을 실행하려면, 반드시 start() 메서드를 호출해야 함!
         * */
        helloThread.run();

        System.out.println(Thread.currentThread().getName() + ": start() 호출 후");
        System.out.println(Thread.currentThread().getName() + ": main() end");
    }
}
