package 매개변수의다형성;
// 상속관게를 이용해 매개변수에 자식타입의 객체를 대입 함
public class ParamPolyEx {
    public static void main(String[] args) {
        Buyer buyer = new Buyer();
        buyer.buy(new PlayStation());

        Tv tv = new Tv();
        buyer.buy(new PlayStation());
    }
}
class Prouct{
    int price;
    int bonusPoint;
}
class Tv extends Prouct{
    public Tv() {
        this.price = 1000;
        this.bonusPoint = 10;
    }
}

class Computer extends Prouct{
    public Computer(){
        this.price= 2000;
        this.bonusPoint= 20;
    }
}
class PlayStation extends Prouct{
    public PlayStation() {
        this.price=1200;
        this.bonusPoint =12;
    }
}
class Buyer {
    int money = 10000;
    int bonusPoint = 0;
    void buy (Prouct p ){
        money -= p.price;
        bonusPoint +=p.bonusPoint;
    }
    void ViewInfo (){
        System.out.println("잔액"+money);
        System.out.println("포인트"+bonusPoint);
    }
}