package 동기화;

import static java.lang.Thread.sleep;

/*
동기화(Synchronized) : 한번에 한개의 스레드만 공유 자원에 접근 할 수 있도록 락(Lock)을 걸어서 다른 스레드가  진행 중인
작업을 간섭하지 못하도록 하는 것
*/
public class SyncMainEx {
    public static void main(String[] args) {
        shareThread shareThread = new shareThread();
        Thread  thread = new Thread(()->{
            shareThread.setValue(100);
        });
        Thread thread1 = new Thread(()->{
           shareThread.setValue(10);
        });
        thread.setName("스레드 1");
        thread1.setName("스레드 2");
        thread.start();
        thread1.start();

    }
}
class shareThread{
    private int value = 0 ;
    public int getValue() {
        return value;
    }
    public synchronized void  setValue(int value){
        this.value = value;

        try{
            sleep(2000);
        }catch (InterruptedException e ){
            throw  new RuntimeException(e);
        }
        System.out.println(Thread.currentThread().getName()+"value의 값 "+this.value+"입니다");
    }

}