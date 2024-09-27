package 아이패드구매하기;

public class IpadproMain {
    public static void main(String[] args) throws InterruptedException {
        Ipad ipadpro = new Ipad("ipad Pro");

        if(ipadpro.continueOrder()) {
            System.out.println("원하는 모델 사이즈를 선택하세요:");
            ipadpro.setScreen();
            System.out.println("색상을선택하세요");
            ipadpro.setColor();
            System.out.println("저장용량을 선택하세요");
            ipadpro.setMemory();
            System.out.println("연결 방식을 선택하세요");
            ipadpro.setNetwork();
            ipadpro.setName();
            ipadpro.progressIpad();
            ipadpro.ipadInfo();
            ipadpro.totalPrice();

        }




}
}
