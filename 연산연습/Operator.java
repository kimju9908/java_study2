package 연산연습;
// 산술연산자 : +,=,*/,%
// 대입연산자 : = , +=, -= ,8*=, %=
// 증감연산자 : ++,-- (현재값에서 1을 증가시키거나 감소 시키는 연산자)
// 비교연산자 : >,<,<=,>=,!=, ==
// 논리연산자 : &&(and) ||(or) ,!(not)
// 삼항연산자 : 조건식 ? 참인경우 수행 구문 : 거짓인 경우 수행 구문
// 비트연산자 : 비트 단위의저 저수준 조작을 하기 위한 연산자


import java.util.Scanner;

public class Operator {
    public static void main(String[] args){
//        int num = 10 ;
//        int num2 = 0;
//        System.out.println(num+num2 );
//        System.out.println(num-num2 );
//        System.out.println(num*num2 );
//        try {
//            System.out.println(num / num2); // 정수끼리 나눗셈을 수행하면 몫이 구해짐
//            System.out.println((double) num /num2);
//            System.out.println(num%num2 );
//        } catch (ArithmeticException e){
//            System.out.println("0으로나눌수없습다");
//        }
//        System.out.println(num++);//후위 증가연산자, 먼저 대입 후 증가

// 100자리 정수를 입력 받아서 3개의 변수에 나누어 담아서 출력하기
// 356 => a = 3, b = 5 , c = 6
// 키보드 입력을 받기 위한 스캐너 객체 생성
        Scanner SC = new Scanner(System.in);
        System.out.print("3자리 정수를 입력하세요:");

        int num = SC.nextInt();
        int a = num/100;
        int b = (num%100)/10;
        int c = num%10;
        System.out.printf("a:%d  b:%d  c:%d ",a,b,c);

    }
}
