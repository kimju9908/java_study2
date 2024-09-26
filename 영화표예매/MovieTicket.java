package 영화표예매;
import java.util.Scanner;
public class MovieTicket {
    // 좌석 10개에 대한 정수형 배열의 인스턴스 변수 생성
   private final int[] seat = new int[10];
    // 좌석당 가격에 대한 인스턴스 필드
  private  final int price;
  Scanner sc= new Scanner(System.in);
   public MovieTicket(int price){
       this.price=price;
   }
    public  void setPotision (){
        printSeat();
        System.out.print("원하는 자리를 선택해주세요:");
        int seatPos = sc.nextInt();
        if (seat[seatPos-1]==0) {
            seat[seatPos-1]=1;
            printSeat();

        }else{
            System.out.println("예매된자리입니다.");

        }

    }

    public void printSeat (){
        for(int i=0; i<seat.length;i++) {
            if (seat[i]==1){
                System.out.print("[v]");
            } else {
                System.out.print("[ ]");
            }

        }
        System.out.println();


    }
    public  void cenPotision (){
        printSeat();
        System.out.print("원하는 자리를 선택해주세요:");
        int seatPos = sc.nextInt();
        if (seat[seatPos-1]==1) {
            seat[seatPos-1]=0;
            printSeat();

        }else{
            System.out.println("예매되지않은자리입니다.");

        }

    }

    public int totalPrice(){
        int cnt = 0;
        for(int e : seat){
            if (e==1) cnt++;
        }
        return cnt*price;
    }
    // 생성자는 좌석당 가격 정보를 객체 생성 시 넣어야 됨으로 매개변수가 있는 생성자 필요

    // 좌석 상태표시 메서드 구현
    // 좌석 예약 메서드 구현
    // 총 판매금액 메서드 구현 (총 판매금액은 인스턴스 필드로 만들지 않고 결과를 반환)

}
