package 상근이알람;

import java.util.Scanner;

//스캐너 객체 생성
//시간입력:
//분입력:
//시간과 분을 분으로 환산
//계산된 분이 45미만이면 하루의 시간을 더해줌
//계산된 시간에서 45분을 빼줌
//다시 시간과 분으로 환산해서 결과 출력
public class AlarmEx {
    public  static  void main(String [] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("시간 입력 : ");
       int a = sc.nextInt();
        int b = sc.nextInt();
        int time = (a * 60) + b;
        if (time < 45) {
            time = (24 * 60) + b;
        }
        time -= 45;
        System.out.printf("%d %d\n", (time / 60), (time % 60));
    }
}
