package This와This;
// this: 자기 자신의 객체를 참조하는 변수
// this()메서드 : 다른 생성자 호출 할 때 사용
public class ThisMethodEx {
    public static void main(String[] args) {
        car Car= new car();

    }

}
class car{
    private String name ;
    private int year;
    private String color;
    private int speed;

    public car(String name, int year, String color, int speed) {
        this.name = name;
        this.year = year;
        this.color = color;
        this.speed = speed;
    }

    public car() {
        this("산타페", 2024,"검정색");
    }

    public car(String name, int year, String color ) {
        this.name = name;
        this.year = year;
        this.color = color;

    }


}