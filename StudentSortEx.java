package 학생성적정렬하기;
// 5명의 학생에 대해 이름과 국어, 영어, 수학 성적을 입력 받아서 정렬하기
// 첫번째 조건은 총점 기준
// 총점이 같으면 이름의 사전순 정렬

import 입력받기연습.ScannerInputEx;
import 컴페어러블.Car;

import java.util.*;

public class StudentSortEx {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeSet<Student> treeSet = new TreeSet<>();
        for(int i = 0 ; i<5 ; i++){
            System.out.print("이름을입력하세요");
            String name1 = sc.next();
            System.out.print("국어 성적을입력하세요");
            int kor1= sc.nextInt();
            System.out.print("영어 성적을입력하세요");
            int eng1= sc.nextInt();
            System.out.print("수학 성적을입력하세요");
            int mat1= sc.nextInt();
            treeSet.add(new Student(name1, kor1,eng1,mat1));

        }
        for (Student e : treeSet){
            System.out.println("이름:"+ e.getName()+"국어:"+e.getKor()+"영어:"+e.getEng()+"수학:"+e.getMat());
        }


    }
}
