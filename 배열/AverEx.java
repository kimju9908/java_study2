package 배열;
//학생수 5명에 대한 성적을 입력받음
//입력받은 성적중에서 40점 미만이 있으면 40점 올림
//평균 점수를 구해서 출력하기
//점수는 모두 0점이상,100점 이하인 5인 배수이다. 평균점수는 항상 정수이다.

import  java.util.Scanner;

public class AverEx {
    public  static void main(String args){
            int[] a = new int[5];
            int total = 0;
            Scanner sc = new Scanner(System.in);
            System.out.print("점수 입력 : ");
            for(int i = 0; i < a.length; i++) {
                a[i] = sc.nextInt();
                if(a[i] <= 40) a[i] = 40;
                total += a[i];
            }
            System.out.println(total/5);
        }


    }

