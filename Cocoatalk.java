package 코코아톡;

public class Cocoatalk {
    private String to; // 상대방 이름
    private String msg; // 전달할 메세지
    public Cocoatalk(String name){
        to = name;
    }
    public void writeMsg(String msg){
        this.msg = to+":"+msg;
    }
    public  void send (NetworkAdapter adapter){
        adapter.send(msg);
    }
}
