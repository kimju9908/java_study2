package 디폴트메서드;

import 추상클래스.Phone;

public class Audio implements RemoteControl {
    private  int volume; // 인스턴스 필드 (객체로 만들어진 변수)

    @Override
    public void turnOn() {
        System.out.println("오디오를 켭니다 ");
    }

    @Override
    public void turnOff() {
        System.out.println("오디오를 끕니다.");
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
    void  getInfo(){
        System.out.println("오디오 입니다.");
        System.out.println("현재 볼륨: "+volume+"입니다.");
    }
}
