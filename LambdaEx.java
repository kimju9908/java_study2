package 람다;
/*
람다: 자바8 버전에서 도입, 간단한 익명 함수를 생성하기 위한 방법을 제공
람다 표현식은 주로 함수형 프로그래밍 스타일을 지원
(매개변수 목록)->{구현부;}
타입추론이 가능한 모든 것을 생략 함
매개변수가 하나인 경우는 ()를 생략 할 수 있음
구현부( 함수의 몸체)가 하나의 명령문인 경우 {}로 생략 가능

함수형 인터페이스 : 자바의 경우는 함수가 단독으로 존재 할 수 없음
자바에서 함수형 인터페이스를 만들기 위해서는 인터페이스를 만들고 함수를 만드어줘야 함
*/

import java.util.*;

interface Calculator {
    int sum(int a, int b); // 자동으로 public abstract가 추가 됨 
}  
class MyCalculator implements  Calculator {
    @Override
    public int sum(int a, int b) {
        return a + b;
    }
}
@FunctionalInterface
interface MyFuncInter{
    public  void  method(int x);
}

@FunctionalInterface
interface MyFuncInter2 {
    int min(int x , int y);
}
public class LambdaEx {
    public static void main(String[] args) {
//        System.out.println(add(100,200));
//   객체 지향 문법을 사용해서 구현
//   MyCalculator 참조 변수로 객체를 접근 
   MyCalculator calc = new MyCalculator();
   // 인터페이스에서 상속받은 메서드인 sum을 오버라딩된 메소를 호출
     int rst = calc.sum(3,4);
     //람다식으로 구현하기
        Calculator mc = (int a , int b )-> a+b; // 인터페이슬 상속 받아 클래스 대신에 람다식으로 구현 
        int rst2 = mc.sum(30,40);
        System.out.println(rst2);
        
//   매개변수가 있는 람다ㅅㄱ 사용 
        MyFuncInter mi = x-> {
            int rst1 = x*5;
            System.out.println(rst1);
        };
        mi.method(5);

        //    매개변수와 반환값이 있는 람다식 구현
        MyFuncInter2 mf2 = (x,y)-> x < y ?x:y; // 구현부가 한줄이면 {} 생략가능
        System.out.println(mf2.min(3,4));
    }

//    static  int add(int x , int y){
//        return x+y;
//    }
}
