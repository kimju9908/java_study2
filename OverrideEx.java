package 상속과오버라이딩;
//final 키워드 :클래스, 필드, 메서드 선언 시 사용 할 수 있음
//메서드 사용하는 경우 상속을하면 오버라이딩을 금지 할 수 있음
//public class OverrideEx {
//    public static void main(String[] args) {
//
////    }
//}
//class Car{
//    int speed;
//    String color;
//    String name;
//    void  accelerator(){
//        System.out.println("차의 속도가 증가합니다.,");
//    }
//    void  breakPanel(){
//        System.out.println("c차의속도가 감소합니다.0");
//    }
//    class  SportsCar extends Car{
//        boolean isTurbo;
//        SportsCar(String  name){
//            isTurbo = false;
//            speed = 200;
//            this.name = name;
//            color = "red";
//        }
//        @Override
//        void  accelerator(){
//            System.out.println("차의 속도가 증가합니다.,");
//        }
//        int getSpeed(){
//            if(isTurbo) return  speed +=1.2;
//            return  speed;
//        }
//        boolean setTurbo(boolean isTurbo){
//            this.isTurbo=isTurbo;
//        }
//        void infoCar(){
//            System.out.println("이름"+name);
//            System.out.println("속도"+getSpeed());
//            System.out.println("이름"+name);
//        }
//    }
//}
//
