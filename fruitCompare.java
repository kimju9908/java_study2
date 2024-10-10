package 컴페어레이터;

import java.util.Comparator;

public class fruitCompare implements Comparator<fruit> {
   @Override
   public  Comparator<fruit> reversed(){
       return  Comparator.super.reversed();
   }


    @Override

    public int compare(fruit o1, fruit o2) {
        if(o1.getPrice() < o2.getPrice()) return 1;
        else if(o1.getPrice()== o2.getPrice()) return 0;
        return -1;
    }
}
