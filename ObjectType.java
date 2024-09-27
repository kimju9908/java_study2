package 객체타입확인;
/*
객체 타입확인: instanceof
객체가 특정 클래스의 인스턴스인지를 확인하기 위해 사용함
반환값(true/false) = 좌항(객체) insatanceo 우항 (클래스)
 */
public class ObjectType {
    public static void main(String[] args) {
        Parent parent = new Parent("부모");
        child Child = new child("자식");

        System.out.println(parent instanceof Parent);
        System.out.println(Child instanceof  Parent);//true, 상속관계가 존재
        System.out.println(parent instanceof child);
        System.out.println(Child instanceof child);
    }
}
class Parent{
    String name;

    public Parent(String name) {
        this.name = name;
    }
}
class child extends Parent{
    String   name;

    public child(String name) {
        super(name);
        this.name = name;
    }
}
