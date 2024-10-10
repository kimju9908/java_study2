package 컴페어레이터;

import java.util.TreeSet;

public class ComparatorEx {
    public static void main(String[] args) {
        TreeSet<fruit> treeSet = new TreeSet<>(new fruitCompare());
        treeSet.add(new fruit("포도",3000));
        treeSet.add(new fruit("수박",10000));
        treeSet.add(new fruit("딸기",12000));

        for(fruit e : treeSet) System.out.println(e);

    }
}
