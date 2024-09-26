package 스위치;

import java.util.Scanner;

/* switch 문은 if문과 마찬가지로 조건 제어문입니다.
if문은 조건식의 결과가 true 또는 false에 따라 분기하고,
switch문은 변수의 값에 따라 실행문이 결정
switch(변수) {
case 값:  값= 정수,문자,문자열이 올 수 있음
    실행문
    break; //switch문을 벗어남
}
 */
public class SwitchEx {
    public static void  main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.print("계절을 입력하세요:");
        String season = sc.next();
        switch(season) {
            case "spring" : // 해당 조건이 실행 됨
                System.out.println("꽃이 피는 봄이 왔어요^^");
                break; // 해당 조건을 종료
            case "summer" :
                System.out.println("무더운 여름 입니다.");
                break;
            case "fall":
            case "autumn" :
                System.out.println("쓸쓸한 가을 입니다.");
                break;
            case "winter":
                System.out.println("아직 겨울이네요ㅠㅠㅠㅠㅠㅠ");
                break;
            default :
                System.out.println("계절을 잘 못 입력 했습니다.");
        }
//        if (season.equals("spring")) {
//            System.out.println("꽃이 피는 봄이 왔어요~");
//
//        } else if (season.equals("summer")) {
//            System.out.println("무더운 여름입니다");
//
//        } else if (season.equals("fall")) {
//            System.out.println("무더운 여름입니다");
//
//        } else if (season.equals("winter")) {
//            System.out.println("무더운 여름입니다");
//
//        } else {
//            System.out.println("잘못입력");
//        }
    }
}