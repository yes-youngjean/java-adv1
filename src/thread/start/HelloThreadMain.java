package thread.start;

public class HelloThreadMain {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + ": main() start");

        HelloThread helloThread = new HelloThread();
        System.out.println(Thread.currentThread().getName() + ": start 호출 전");
        helloThread.start();    //-> 스레드 실행 메서드 (run() 사용X)
                                //-> Main 스레드는 해당 스레드가 끝나길 기다리지 않음
        System.out.println(Thread.currentThread().getName() + ": start 호출 후");

        System.out.println(Thread.currentThread().getName() + ": main() end");

    }
}
