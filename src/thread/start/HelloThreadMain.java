package thread.start;

public class HelloThreadMain {
    public static void main(String[] args) {

        System.out.println(Thread.currentThread().getName() + ": main() start");


        /**
         * 1. main 스레드가 start() 메서드를 호출하면 자바는 스레드를 위한 별도의 스택 공간을 할당함.
         * 2. 새로운 Thread-0 스레드가 사용할 공간이 만들어짐.
         * 3. Thread-0 스레드는 run() 메서드의 스택 프레임을 스택에 올리면서 run() 메서드 시작
         *    (main 스레드가 run() 메서드 실행시키는게 아님 XXXXX)
         * */
        HelloThread helloThread = new HelloThread();
        System.out.println(Thread.currentThread().getName() + ": start() 호출 전");
        helloThread.start();

        /**
         * main 스레드는 Thread-0 스레드를 기다리지 않고 바로 넘아감
         * */
        System.out.println(Thread.currentThread().getName() + ": start() 호출 후");

        System.out.println(Thread.currentThread().getName() + ": main() end");
    }
}
