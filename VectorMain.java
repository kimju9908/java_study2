package List인터페이스실습;

import java.util.List;
import java.util.Vector;

/*
Vector: ArrayList와 동일한 내부 구조를 가짐
차이점은 동기화(Syncronized)메서드로 구성되어 있어 멀티스레드 환경에서 안전
*/
public class VectorMain {
    public static void main(String[] args) {
        List<NameCard> list = new Vector<>();
        list.add(new NameCard("민지", "adasdas@gmail.com", "010-2222-1111", "누진스"));
        list.add(new NameCard("하니", "adas@gmail.com", "010-2222-1111", "누진스"));
        list.add(new NameCard("혜린", "adasd@gmail.com", "010-2222-1111", "누진스"));
        list.add(new NameCard("다니엘", "adasda@gmail.com", "010-2222-1111", "누진스")); list.add(new NameCard("민지", "adasdas@gmail.com", "010-2222-1111", "누진스"));

        for(NameCard e : list){
            System.out.println("이름"+e.name);
            System.out.println("이메일"+e.email);
            System.out.println("잔허ㅣ"+e.phone);
            System.out.println("직업"+e.job);
        }
    }
}
class NameCard{
    String name;
    String email;
    String phone;
    String job;

    public NameCard(String name, String email, String phone, String job) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.job = job;
    }
}
