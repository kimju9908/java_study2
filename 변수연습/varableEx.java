package 변수연습;
// 변수란 값을 저장할 수 있는 메모리 공간에 이름을 붙여 놓은 것
// 자바는 JVM이 미리 윤영체제로 부터 메모리를 확보받고 재할당 해주는 개념
// 자바는 데이터형이 존재하기 때문에 사용 목적에 맞는 데이터 타입을 선언해야 함
// 특수문자 중 _,$ 사용 가능
// 키워드 안됨, 숫자가 앞에 오면 안됨, 공백안됨
// camel 표기법 사용, 파이썬은 snake
// 변수의 이름은 사용 목적에 맞게 지어야 함

public class varableEx {
    public static void main(String[] args){ // 변수는 중괄호 {} 블로 내에서 선언되고 사용된다.(Block Scope 언어)
//        int age; // 변수 사용전에 반드시 먼저 변수를 선언하고 초기화 해야함
//        String name ;
//        char gender;
//        double avg;
//
//        int a = 23 ; // 변수를 선언과 동시에 값을 할당

//        int hour = 3;
//        int minute = 5;
//        System.out.println(hour + "시간" + minute + "분");

        byte num1 = 127;
        num1++;
        System.out.println(num1);

        char ch1 = 'A';
        System.out.println(ch1);
        System.out.println((int)ch1);
        char ch2 = 66;
        System.out.println(ch2);

        double pie = 3.141592;

        double num10 = 0.0; // 근사치 계산법 때문에 100이 나오지 않는다.
        for (int i=0;i<1000;i++){
            num10+= 0.1;
        }
        System.out.println(num10);
    }
}
