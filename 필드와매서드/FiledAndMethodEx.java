package 필드와매서드;
/* 필드: 변수의 속성을 표현하는 필드
   메서드: 동작을 규정, 함수와 동일한 형태이고 클래스 내부에 존재
   자바는 클래스 기반의 언어 임으로 클래스 외부의 별도의 함수가 존재 할 수 없다.
 */
public class FiledAndMethodEx {
    public static void main(String[] args) {
//        FiledAndMethodEx test = new FiledAndMethodEx();
//        int sum =test.sum(100,200);
//        System.out.println(sum);
//
//       int sum = FiledAndMethodEx.sum(100,200);
//       System.out.println(sum);
//       System.out.println(sum("Test","Java"));
//       System.out.println(sum("test",1234));
//       System.out.println(sum(1,2,3,4,5,6,7));
        String factory = "현대자동차 울산 공장 ";
Car gv70 = new Car("gv70","red",200,400);
Car ionic5N = new Car("아이오닉 5N","blue",300,600);
Car x6 = new Car("x6","black",250,300);
Car santafe = new Car();
Car sorento = new Car("쏘렌토");
gv70.getCarInfo();
sorento.getCarInfo();

    }
    // 클래스 매서드 , 매개변수의 입력 및 존재, 반환값도 존재
//  static int sum(int a, int b ){
//        return a+b;
//    }
//    //매서드 오버로딩
//    static  String sum(String a, String b ){
//        return a+b;
//    }
//
//    static  String sum(String a, int b ){
//        return a+b;
//    }
//    // 매개변수의 갯수를 알수 없을 때 사용하는 방법(전개 연산자)
//    static int sum (int ...val){
//        int sum=0;
//        for (int e : val){
//            sum+=e;
//        }
//        return  sum;
//    }
    //인스턴스 메서드
//    int sum(int a, int b ){
//        return a+b;
//    }
}
 class Car {
    static int ProductNumber = 0;
     static String company = "현대자동차";
     String model;
     String color;
     int speed;
     int horsePower;

     Car(String model, String color, int speed, int hP) {
         this.model = model;
         this.color = color;
         this.speed = speed;
         this.horsePower = hP;
     }
     Car() {

     }
     Car(String model) {
         this.model = model;

     }
     void getCarInfo(){
         System.out.println("이름:" + model);
         System.out.println("속도:"+speed);
         System.out.println("마력:"+horsePower);
         System.out.println("색상:"+color);
     }

 }
