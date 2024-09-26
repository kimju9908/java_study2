package 시스템입출력;

public class SystemIn0ut {
    /*자바 표준 입출력 클래스
    System.in(표준입력) : 프로그램내에서 사용자의 입력을 받음(콘솔 입력)
    System.out(표준 출력) : 프로그램 내의 결과를 콘솔에 출력 (리다이렉션 가능)
    print(메서드오버로딩),println(메서드오버로딩),printf(서식지정자)
    System.err(표준 오류) : 오류를 출력 하기 위해서 사용 (리다이렉션 안됨), 대체제가 있음(sl4f)
    서식지정자: %d(decimal),%ld(long decimal),%f(float), %2.f
    %5d(5칸의 공간을 잡고 오른쪽 정렬),%-5d(왼쪽 정렬),%s(string),%c (character)
    %%(%기호를 출력)
    이스케이브 시퀀스: \n (줄바꿈),\r(커서를 맨앞으로 이동),\t(탭),\b(백)
     */

    public static void  main (String[] args){

        String name = "Lee";
        String addr = "Seoul City";
        char gender = 'F';
        int age = 18;
        int kor = 99;
        int eng = 88;
        int mat = 40;
        double aver = 0.0;

        // 자바 스타일 (print 오버로딩)
        System.out.println("====== Java Style output =======");
        System.out.println("Name : " + name);
        System.out.println("Address : " + addr);
        System.out.println("Gender : " + gender);
        System.out.println("Age : " + age);
        System.out.println("Total : " + (kor + eng + mat));
        //명시적 형변환과 묵시적 형변환이 일어남
        System.out.println("Average : " + (double)(kor + eng + mat) / 3);

        // C언어 스타일 (printf 서식지정자)
        System.out.println("====== C Style Output ======");
        System.out.printf("Name : %s\n", name);
        System.out.printf("Address : %s\n", addr);
        System.out.printf("Gender : %c\n", gender);
        System.out.printf("Age : %d\n", age);
        System.out.printf("Total : %d\n", (kor + eng + mat));
        System.out.printf("Average : %.2f\n", (double)(kor + eng + mat)/3);
    }
}


