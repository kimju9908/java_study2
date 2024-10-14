package 스트림활용하기;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class StreamApply {
    public static void main(String[] args) {
        List<TravelCustomer> customers = new ArrayList<>();
        customers.add(new TravelCustomer("안유진",21,1000));
        customers.add(new TravelCustomer("유나",21,2000));
        customers.add(new TravelCustomer("카즈하",21,1000));
        customers.add(new TravelCustomer("혜린",19,1000));
        System.out.println("\n=====고객 명단====");
        customers.stream().map(TravelCustomer::getName).forEach(e->System.out.print(e+" "));

        System.out.println("\n=====여행 총 비용 계산=====");
        int total = customers.stream().mapToInt(TravelCustomer::getPrice).sum();
        System.out.println("총 비용: "+total);
    System.out.println("=====20세 이상 명단=====");
    customers.stream()
            .filter(e->e.getAge()>=20)
            .map(TravelCustomer::getName)
            .sorted()
            .forEach(e->System.out.println(e+" "));
    }



}
class TravelCustomer {
    private String name;
    private int age;
    private int price;

    public TravelCustomer(String name, int age, int price) {
        this.name = name;
        this.age = age;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
