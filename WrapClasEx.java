package WrapClassEX;
/*
Wrapper클래스 : 기본 타입의 데이터를 객체 타입으로 취급하도록 변환해 주는 클래스
*/
public class WrapClasEx {
    public static void main(String[] args) {
//        IntegerEx integerEx = new IntegerEx();
//        integerEx.x= 100;
//        System.out.println(integerEx.x);
        Integer x= 100;//Auto Boxing
        int xx= x; //Auto Unboxing
    }

}
class IntegerEx{
    int x ;
    IntegerEx(int x){
        this.x  = x;
    }
}
