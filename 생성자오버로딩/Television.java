package 생성자오버로딩;
// 생성자는 클래스 이름과 같고, 반환 타입이 없음(void 안됨)
// 생성자는 외부에서 접근해야 하기 때문 일반적으로 public 접근 제한자를 사용
// 싱글톤 객체를 생성할 때는 접근 제한자를 private해서 객체 생성을 제한 할 수 있음
public class Television {
    private boolean isOn;
    private  int channel;
    private  int volume;
    //기본 생성자는 생성자가 없는 경우에 자동 생성 도미
    public Television(){
        isOn = false;
        channel = 10;
        volume = 10;
        System.out.println("매개변수가 없는 생성자 호출 ");

    }
    public Television(boolean isOn,int channel,int volume){
        this.isOn = isOn;
        this.channel = channel;
        this.volume = volume;
        System.out.println("매개변수가 전부있는 생성자");
    }
    public  void  setOn(boolean onOFF){
        isOn = onOFF;
        String onoffStr = (isOn)? "on" :"off";
        System.out.println("TV:"+onoffStr);
    }
    public  void setChannel(int cnl){
        if (cnl>=1&& cnl<=999){
            channel = cnl;
            System.out.println("채널을"+channel+"변경 하였습니다.");
        }

    }
    public void setVolume(int vol){
        if (vol>=0 && vol<=99){
            volume = vol ;
            System.out.println("볼륨을"+volume+"변경 하였습니다.");
        }

    }
    public  void  getTV(){
        String onOffStr = (isOn) ? "on":"off";
        System.out.println("====Tv 정보=====");
        System.out.println("전원:"+onOffStr);
        System.out.println("채널:"+channel);
        System.out.println("볼륨:"+volume);
    }
}
