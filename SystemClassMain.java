package 시스템클래스;

import static java.lang.Thread.sleep;

// System 클래스 : 표준 입,출력 관련, 시스템 정보 관련 메서드 제공
public class SystemClassMain {
    public static void main(String[]args) throws InterruptedException {
        int[] data = new int[1000];
        int cnt = 0, i;
        // 배열내에서 찾고자 하는 임의의 수
        int randVal = (int)(Math.random() * 1000) + 1;
        for(i = 0; i < data.length; i++) {
            data[i] = i + 1;
        }
        long time1 = System.currentTimeMillis();
        // 순차 검색
        for(i = 0; i < data.length; i++) {
            cnt++; // 총 검색 횟수 구하기
            sleep(1);
            if(randVal == data[i]) {
                System.out.println("위치 : " + (i+1));
                break;
            }
        }
        long time2 = System.currentTimeMillis();
        System.out.println("총 검색 횟수 : " + cnt);
        System.out.println("검색에 소요된 시간은 " + (time2 - time1) + "밀리초 입니다.");
    }
}
