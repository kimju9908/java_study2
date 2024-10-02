package 자동차만들기;
import java.util.Scanner;
public class CarMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Car car = null;
        int cnt = 0;
        int distance = 0;
        int customer = 0;
        int price = 2000;
        int oilcnt;
        int totalDistace = cnt * distance;
        System.out.print("이동 지역 선택 [1]부산 [2]대전 [3]강릉 [4] 광주 : ");
        int num = sc.nextInt();
        switch (num) {
            case 1: distance = 400; break;
            case 2: distance = 200; break;
            case 3: distance = 150; break;
            case 4: distance = 300; break;
        }
        System.out.print("이동할 승객 수 입력 : ");
        customer = sc.nextInt();
        System.out.print("이동할 차량 선택 [1]스포츠카 [2]승용차 [3]버스 : ");
        int num1 = sc.nextInt();
        switch (num1) {
            case 1: car = new sportsCar("Ferrari");car.getOption();break;
            case 2: car = new sedan("gv80");car.getOption();break;
            case 3: car = new bus("관광버스");car.getOption();break;
            default: break;
        }
        if(customer%car.getSeat() == 0) {
            cnt =customer/car.getSeat();
        } else if (customer<car.getSeat()) {
            cnt = 1;
        } else {
            cnt = (customer/car.getSeat())+ 1;
        }
        if ((totalDistace/car.getOil())%car.getSize() == 0) {
            oilcnt = (totalDistace)/ car.getOil() / car.getSize();
        } else if  ((totalDistace / car.getOil()) < car.getSize()) {
            oilcnt = 1;
        } else {
            oilcnt = (totalDistace/ car.getOil() / car.getSize()) + 1;
        }
        float time =totalDistace/(car.getSpeed() / 60);
        System.out.print("날씨 [1]맑음 [2]비 [3]눈: ");
        int weather = sc.nextInt();
        switch (weather) {
            case 1: break;
            case 2: time *= 1.2; break;
            case 3: time *= 1.4; break;
            default: break;
        }
        int totalprice = totalDistace/ car.getOil()*price;
        String str = String.format("%,d", totalprice);
        System.out.println("====== " + car.getName() + " =======");
        System.out.println("총 비용 : " + str);
        System.out.println("총 주유 횟수 : " + oilcnt);
        System.out.println("총 이동 시간 : " + (int)(time / 60) + "시간 "+(int) (time % 60) + "분");
    }
}









