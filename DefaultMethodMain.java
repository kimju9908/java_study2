package 디폴트메서드;

import 추상클래스.Phone;

import java.util.Scanner;

/* 인터페이스 모든 문법과 디폴트메서드에 대해 학습

 */
public class DefaultMethodMain {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        RemoteControl rc;
        System.out.println("1.tv 2. audio :");
        int sel = sc.nextInt();
        if(sel==1){
            rc= new Television();
            rc.turnOn();
            rc.setVolume(20);
            RemoteControl.changeBattery();
            rc.setMute(true);
        } else {
           rc = new Audio();
            rc.turnOn();
            rc.setVolume(102);
         /*   Audio audio =new Audio();
            audio.turnOn();
            audio.setVolume(200);*/
            rc.setMute(true);
        }
        RemoteControl rc2 = new RemoteControl() {
            int volume;
            @Override
            public void turnOn() {
                System.out.println("PS의 전원을 켭니다.");
            }

            @Override
            public void turnOff() {
                System.out.println("PS의 전원을 끕니다.");
            }

            @Override
            public void setVolume(int volume) {
                if (volume > RemoteControl.MAX_VOLUME){
                    this.volume = RemoteControl.MAX_VOLUME;
                } else  if (volume<RemoteControl.MIN_VOLUME){
                    this.volume = RemoteControl.MIN_VOLUME;
                }else {
                    this.volume = volume;
                }

            }
        };
        rc2.turnOn();
        rc2.setVolume(200);


    }
}
