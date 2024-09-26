package 반복문;
/*
반복문: 주언진 조건이 참인 동안 혹은 정해진 횟수 만큼 반복적으로 프로그램을 수행하는 것
while문 , do~while문 , for 문 , Enhanced for 문 (요소의 개수를 자동 순회)
 */
import  java.util.Scanner;
public class InteratorEx {
    public  static void main(String[ ] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("정수입력:");
        int n = sc.nextInt();
        int sum = 0;
        while(n>0){
            sum+=n;
            n--;
        }

        System.out.println("합계:" +sum);
    }
}
