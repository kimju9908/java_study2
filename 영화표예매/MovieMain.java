package 영화표예매;

import java.util.Scanner;

//예매하기와 종료하기 메뉴만들기1

// 총 좌석은 10개
// 좌석당 가격은 생성자를 통해서 입력
// 좌석 정보에 대한 메서드 작성
// 좌석 예액 하기: 값이 0이면 예약 안된 좌석,1이면 판매된 좌석
// 총 판매금액에 대한 메서드 작성
//
public class MovieMain {
    public static void main(String[] args) {
        MovieTicket n = new MovieTicket(12000);
        //MovieTicket 클래스에 대한 객체 생성
        //입력 받기 위한 스캐너 생성
        // 1좌
//메뉴 작성은  무한 반복문으로 구현하고 종료하기 누르면 총 판매 금액 표시 하고 종료
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("1.예약하기 2.종료하기 3.예매취소 4.전체가격보기 ");
            int a =sc.nextInt();

            if (a==1){
                n.setPotision();
            } else if (a==2){
                break;

            }else if(a==3){
                n.cenPotision();

            }else{
                System.out.print("전체가격:"+n.totalPrice());
            }
        }
    }
}
