package 상속티비만들기;

import static 아이패드구매하기.Common.PROTOTYPE_CHANNEL_MAX;

public class ProtoTypeTv {
    boolean isPower;
    int channel;
    int volume;
    public ProtoTypeTv (){}
    public  ProtoTypeTv(boolean isPower,int channel,int volume){
        this.isPower = isPower;
        this.channel = channel;
        this.volume = volume;
    }
    public  void setChannel(int cnl){
        if(cnl>0 && cnl< PROTOTYPE_CHANNEL_MAX){
            channel=cnl;
        }else{
            System.out.println("채널 설정 범위가 아닙니다.");
        }
    }

}
