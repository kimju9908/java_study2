package 자동차만들기;
import java.util.Scanner;
class bus implements Car{
    int oil = 5;
    float speed = 150;
    int size = 100;
    int seat = 20;
    public String name;
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
    bus(String name){
        this.name = name;
    }
    public void getOption() {
        System.out.println("부가기능 [1] On [2] Off");
        int option  = sc.nextInt();
        if(option==1) size += 30;
    }
}