package 반복문;
//1~1000사이의 7의 배수를 구하고, 한줄에 10개 항목씩 출력하기
//for(초기값;최종값;증감값)
import  java.util.Scanner;
public class InteratorEx2 {
    public static void main(String [] args){
//        for(int i=1;i<=1000;i++){
//            if (i%7==0){
//                System.out.printf("%5d",i);
//            } if(i%70==0){
//                System.out.println();
//            }
//        }
//        for(int i=1; i<=9;i++){
//            for(int j; j<=9 ;j++){
//                System.out.printf("%d * %d = %d",i,j,i*j);
//
//            }
//        }
//       3번: 입력이 5인 경우
        Scanner sc= new Scanner(System.in);
        System.out.print("정수입력");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.println();
            for(int j=n ; j>=i;j--){
                System.out.print("*");

            }
        }
    }
}
