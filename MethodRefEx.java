package 메서드참조;

import java.util.function.IntBinaryOperator;
class Calculator {
static  int staticMethod(int x , int y){
    return  x+y;
}    int instanceMethod( int x , int y){
    return x+y;
    }
}
/*
메서드 참조 : 메서드를 참조해서 매개 변수의 정보 및 리턴 타입을 알아내어, 불필요한 매개변수 제거 목적
*/
public class MethodRefEx {
    public static void main(String[] args) {
        IntBinaryOperator operator ;
        //정적 메서드 참조
        operator = (x,y) -> Calculator.staticMethod(x,y);
        System.out.println("결과"+operator.applyAsInt(1,2));

        //정적메서드 참조
        operator= Calculator::staticMethod;
        System.out.println("결과"+operator.applyAsInt(1,2));

    }
}
