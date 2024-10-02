package 자동차만들기;
import java.util.Scanner;
class sedan implements Car{
    String name;
    float speed = 200;
    int oil = 12;
    int size = 45;
    int seat = 4;
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
    sedan(String name){
        this.name = name;
    }
    public void getOption() {
        System.out.println("부가기능 [1] On [2] Off");
        int option  = sc.nextInt();
        if(option==1) seat+=1;
    }
}

