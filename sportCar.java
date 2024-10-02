package 자동차만들기;
import java.util.Scanner;
class sportsCar implements Car{
    String name;
     float speed =250;
    int oil = 8;
    int size = 30;
    int seat = 2;
Scanner sc =new Scanner(System.in);
    public int getOil() {
        return oil;
    }
    public float getSpeed() {
        return speed;
    }
    public int getSize() {
        return size;
    }
    public int getSeat() {
        return seat;
    }
    public String getName() {
        return name;
    }
    sportsCar(String name){
        this.name = name;
    }
    public void getOption() {
        System.out.println("부가기능 [1] On [2] Off");
        int option  = sc.nextInt();
        if(option==1) speed+=50;
    }
}