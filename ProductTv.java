package 상속티비만들기;

import static 아이패드구매하기.Common.*;

public class ProductTv extends ProtoTypeTv{
    String name;
    boolean isInternet;//인터넷기능 on/off
    public  ProductTv (String name){
        super(false,10,10);
        this.name=name;//super() 부모의 생성자를 호출
    }
    void setPower(int vol){
        if(vol>=MIN_VOLUME && vol<=MAX_VOLUME){
            this.volume =vol;
        }else{
            System.out.println("볼륨 설정 범위를 벗어 났습니다.");
        }
    }
    @Override
   public void setChannel(int cnl){
        if(cnl>0&&cnl<PRODUCT_CHANNEL_MAX){
            channel =cnl;
            System.out.println(channel+"채널로 변경했습니다.");
        } else{
                System.out.println("채널 설정 범위가 아닙니다.");
        }

    }
    //오버로딩
    public  void setChannel(int cnl,boolean isInternet){
        if(isInternet){
            System.out.println("인터넷 모드 입니다.");
            this.isInternet = true;
        } else {
            this.isInternet= false;
            if(cnl>0&&cnl<PRODUCT_CHANNEL_MAX){
                channel =cnl;
                System.out.println(channel+"채널로 변경했습니다.");
            } else{
                System.out.println("채널 설정 범위가 아닙니다.");
            }
        }
    }
    void tvInfo(){
        System.out.println("이름:"+ name);
        System.out.println("전원:"+isPower);
        System.out.println("채널:"+channel);
        System.out.println("볼륨:"+volume);
        System.out.println("인터넷 모드: "+ isInternet);
    }
}
