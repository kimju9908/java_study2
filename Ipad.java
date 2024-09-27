package 아이패드구매하기;

import java.lang.ref.PhantomReference;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import static java.lang.Thread.sleep;

public class Ipad {
    private Scanner sc;// 입력을 받기 위한 스캐너
    private int screen;
    private int color;// 11인치와 13인치
    private int memory; //128,256,512,1,2 기가
    private String name;//각인서비스 이름저장
    private String productDate;
    private static int cnt = 0;
    private int network;
    private  int price;
    String serialNum;

    public  Ipad(String name){
        this.sc= new Scanner(System.in);
        this.name = name;
        Date now = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyMMdd");
        productDate = sdf.format(now);//지정된 format 형태로 시간정보가  가공되서 반환
        cnt++;
        productDate +=cnt; // 산술연산이 아니고 문자열을 연결 함
    }

    public boolean continueOrder(){
        System.out.println("=====ipad Pro 구입하기 =====");
        System.out.println("구입을 진행하려면 YES / 종료는 NO :");
        String isContinue = sc.next();
        if(isContinue.equalsIgnoreCase("yes")) return true;
        else return  false;
    }

    public void setScreen() {
        while (true) {
            this.sc = new Scanner(System.in);
            System.out.println("1.11 2.13");
            screen = sc.nextInt();
            if (screen == 2 || screen==1 ) {
                return;
            }else{
                System.out.println("잘못된 선택입니다");
            }
        }
    }

    public void setColor(){
        while (true) {
            this.sc = new Scanner(System.in);
            System.out.println("1.실버 2.스페이스블랙");
            color = sc.nextInt();
            if (color == 2 || color==1 ) {
                return;
            }else{
                System.out.println("잘못된 선택입니다");
            }
        }

    }
   public void setMemory(){
       while (true) {
           this.sc = new Scanner(System.in);
           System.out.println("1.256GB 2.512GB 3.1TB 4.2TB");
           memory = sc.nextInt();
           if (memory <= 5 || color>=1 ) {
               return;
           }else{
               System.out.println("잘못된 선택입니다");
           }
       }

    }
    public void setNetwork(){
        this.sc = new Scanner(System.in);
        System.out.println("1.wifi 2.cellular");
        network = sc.nextInt();
        if (network == 2 || network==1 ) {
            return;
        }else{
            System.out.println("잘못된 선택입니다");
        }

    }
    public  void setName(){
        this.sc = new Scanner(System.in);
        System.out.println("각인하실 문구를 작성해주세요");
        name =sc.next();
    }
    public  void setSerialNum(){
        String screenStr = (screen ==1) ? "11" :"13";
        String[] meomoryStr = {"","256","512","1024","2048"};
        String networkStr = (network==1) ? "W" :"C";
        serialNum = "iPadPro"+screenStr+meomoryStr[memory]+networkStr+productDate;


    }
    //제품 옵션 선택이 완료되면 출고까지 30초 동안 제품 생산 진행상황 보여주고 출고
    void progressIpad() throws InterruptedException {
        int cnt = 0;
        while (true){
            sleep(300);
            cnt++;
            System.out.printf("<<iPadPro 제작중 : [%d%%]>>\r",cnt);
            if(cnt>=100) break;
        }

    }
    //제품에 대한 선택 옵션과 일련번호, 총가격
    public void ipadInfo(){
        String [] memory1 = {"","256","512","1024","2048"};
        String [] screen1= {"","11","13"};
        String [] color1= {"","실버","스페이스그레이"};
        String [] network1= {"","wi-fi","cellular"};
        System.out.println("화면크기:"+screen1[screen]);
        System.out.println("저장공간:"+memory1[screen]);
        System.out.println("색상:"+color1[screen]);
        System.out.println("연결성:"+network1[screen]);




    }
    // 선택한 옵션을 포함한 제품 가격 구하기
    public void  totalPrice (){
        int [] memoryPrice = {0,0,300000,900000,1500000};
        int [] screenPrice = {0,1490000,1990000};
        int [] networkPrice = {0,0,300000};
        price += memoryPrice[memory];
        price += screenPrice[screen];
        price += networkPrice[network];
        System.out.println("총가격:"+price);
        System.out.println(name);
        setSerialNum();
        System.out.println("제품넘버:"+serialNum);


    }


}
