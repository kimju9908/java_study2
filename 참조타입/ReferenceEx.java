package 참조타입;
/*
참조타입: 할당된 변수에 실제 값이 저장되는 것이 아니라 주소가 저장됨
참조하는 대상이 없는 경우 : null point exception
 */
public class ReferenceEx {
    public static void main(String [] args){
        String name = "";
        String name2 = null;
        System.out.println(name2);
        int age= 0; // 참조타입이 아니여서  null 사용 x
        //int age1 = null;  참조형이 아니여서 에러가 난다.
        Integer age2 =null;
        Integer age3 = 0 ; // Auto unboxing 기능이 있음
        System.out.println(age2);
//      int[] arr = null;
        Integer boxVal = null;
        int intval = boxVal;// 참조타입의 값을 대입
        System.out.println(intval);




    }
}
