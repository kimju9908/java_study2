package 등급입력;

import java.util.Scanner;

//국어,영어,수학 성적을 입력 받아서 총점을 구하고
// 총점이 90점 이상이면 a
// 80 점이상이면 b
// 70 점이상이면 c
// 60 점이상이면 d
// 나머지는 f
// 각각의 성적은 0~100로 입력 되어야하고입력값이 잘못된경우 재입력을 받아야 한다.
public class GradeEx {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("점수를 입력하세요:");
        int a  = sc.nextInt();
        int b  = sc.nextInt();
        int c  = sc.nextInt();
        int score = (a+b+c)/3;
        while(true){
            if(score < 0 || score > 100) continue;
            if(score >= 90) System.out.println("A");
            else if(score >= 80) System.out.println("B");
            else if(score >= 70) System.out.println("C");
            else if(score >= 60) System.out.println("D");
            else System.out.println("F");
            break;
        }
    }
}
