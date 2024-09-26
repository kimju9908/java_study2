package 스위치문계산기;

import java.util.Scanner;

public class SwitchEx2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        char op = sc.next().charAt(0);
        int y = sc.nextInt();

        switch (op){
            case '+':
                System.out.println("덧셈: " + (x + y));
                break;
            case '-':
                System.out.println("뺄셈: " + (x - y));
                break;
            case '*':
                System.out.println("곱셈: " + (x * y));
                break;
            case '/':
                if (y != 0) {
                    System.out.println("나눗셈: " + ((double)x / y));
                } else {
                    System.out.println("0으로 나눌 수 없습니다.");
                }
                break;
            default:
                System.out.println("연산자 잘못 입력");
        }
        sc.close(); // Scanner 객체 닫기
    }
}
