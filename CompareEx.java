package 컴페어러블;

import java.util.TreeSet;

/*
Comparable 과 Comparator는 자바에서 객체를 정렬하는데 사용하는 인터페이스
Comparable : 나와 다른 객체를 비교하는 방식
Comparartor : 두개의 다른 객체를 비교 해줌
*/
public class CompareEx {
    public static void main(String[] args) {
        TreeSet<Car> treeSet = new TreeSet<>();
        treeSet.add(new Car("Santafe", 2023, "white"));
        treeSet.add(new Car("Sorento", 2005, "black"));
        treeSet.add(new Car("Gv90", 2024, "Gray"));
        treeSet.add(new Car("Morning", 2023, "Red"));
        for (Car e : treeSet) {
            System.out.println("이름:" + e.getName() + ":" + e.getYear());
        }
    }
}
