package 입력받기연습;

import java.util.Scanner;

/*
이름
주소
성별
나이
====회원정보출력===

 */
public class ScannerInputEx {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("이름을 입력하세요:");
        String a = sc.next();
        sc.nextLine();// 버퍼 비우기
        System.out.print("주소를 입력하세요:");
        String b = sc.nextLine();
        System.out.print("성별을 입력하세요");
        char d = sc.next().charAt(0);
        System.out.print("나이를 입력하세요:");
        int c = sc.nextInt();

        System.out.println("===회원정보===");
        System.out.printf("이름:%s\n",a);
        System.out.printf("주소:%s\n",b);
        System.out.printf("성별:%c\n",d);
        System.out.printf("나이:%d\n",c);



    }
}
