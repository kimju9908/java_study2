package 컴페어레이터;

public class fruit {
    private String name;
    private int price;

    public fruit(String name, int price) {
        this.name = name;
        this.price = price;
    }
    @Override
    public  String toString(){
        return name+":"+ price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }
}
