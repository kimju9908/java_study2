package 스레드종료;
/*
스레드 안전한 종료 : 원래는 stop()이라는 메서드가 존재했지만 현재는 사용중지 되었음
대체 방법으로는 stop 플래그를 사용하는 방식, interrupt() 메소드를 사용하는 방식
*/
public class ThreadStopEx {
    public static void main(String[] args) throws InterruptedException {
//        RunThread runThread = new RunThread();
//        runThread.start();
//        Thread.sleep(10000); // main thread가 sleep 상태가 됨
//        runThread.setStop(true);

        InterruptThread interruptThread = new InterruptThread();
        interruptThread.start();
        Thread.sleep(1000);
        interruptThread.interrupt();
    }
}
// stop 플래그를 사용하는 방식
 class RunThread extends  Thread {
    private boolean stop; // stop 플래그 설정

    public void setStop(boolean stop) {
        this.stop = stop;
    }
    @Override
    public  void run(){
        while (!stop){
            System.out.println("Thread 실행중 ");
        }
        System.out.println("자원정리");
        System.out.println("실행종료");
    }
}
class InterruptThread extends  Thread {
    @Override
    public  void  run(){
        try {
            while (true){
                System.out.println("스레드 실행중");
                Thread.sleep(1); // 인터럽트를 실행시키려면 sleep 을 사용하여 멈춰주어야 중간에 인터럽트 실행가능
            }
        } catch (InterruptedException e){
            System.out.println(e+"예외 발생!");
        }
        System.out.println("자원 정리");
        System.out.println("실행종료");
    }
}