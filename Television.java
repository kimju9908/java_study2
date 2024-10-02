package 디폴트메서드;

public class Television implements  RemoteControl{
    private int volume;

    @Override
    public void turnOn() {
        System.out.println("티비를 켭니다 ");
    }

    @Override
    public void turnOff() {
        System.out.println("티비를 끕니다.");
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
        System.out.println("티비 입니다.");
        System.out.println("현재 볼륨: "+volume+"입니다.");
    }
}

