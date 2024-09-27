package 상속티비만들기;
//상속,오버로딩,오버라이딩 기본 동작을 이용해 티비만들기
public class InheritanceTvMain {
    public static void main(String[] args) {
        ProductTv lgTv = new ProductTv("우리집");

        lgTv.setPower(30);
        lgTv.setChannel(30,true);
        lgTv.tvInfo();

        ProtoTypeTv samTV = new ProductTv("남의집 TV");

    }
}
