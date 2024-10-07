package 제네릭프린터;

public class Plastic {
    public void doPrinting(){
        System.out.println("plastic 재료로 출력 합니다.");

    }
    @Override
    public String toString(){
        return "재료는 plastic 입니다.";
    }
}
