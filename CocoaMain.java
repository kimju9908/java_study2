package 코코아톡;

import java.util.Scanner;

public class CocoaMain {
    public static void main(String[] args) {
        Cocoatalk cocoatalk = new Cocoatalk("장원영");
        cocoatalk.writeMsg("오늘 날씨가 갑자기 쌀쌀해 졌어요. 건강하게 활동 잘 하세요");
       NetworkAdapter adapter = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("메세지 전송 할 네트워크: 1.WIFI 2.5G 3.LTE:  ");
        int sel = sc.nextInt();
        switch (sel){
            case 1:
                adapter = new Wifi();
                break;
                case 2 :
                    adapter = new FiveG(); break;
            case 3 :
                adapter  = new LTE(); break;
            default:
                System.out.println("전송할 네트워크가 잘못 선택이 되었습니다.");
        }
        if (adapter !=null) cocoatalk.send(adapter);


    }
}
