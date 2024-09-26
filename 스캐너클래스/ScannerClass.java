package 스캐너클래스;
// 기본적인 데이터 타입에 대한 입력을 Scanner 클래스 메서드를 사용하여 입력 받을 수 있음
import java.util.Scanner;
//스캐너 클래스는 util 패키지 내에 존재하므로 import 해야함.

public class ScannerClass {
    public static void main(String [] args){
        // sc : 스캐너 클래스에 대한 참조변수(Scanner 클래스로 만들어진 객체의 주소)
        //new : heap 메모리 할당,동적할당,메모리에 대한 해제를 해야 함
        // System.in : 콘솔로 부터 입력을 받기 위한 객체로 생성
        Scanner in = new Scanner(System.in);

        byte a = in.nextByte(); 		// byte 형 입력 및 리턴
        short b = in.nextShort(); 		// short 형 입력 및 리턴
        int c = in.nextInt(); 			// int 형 입력 및 리턴
        long d = in.nextLong(); 		// long 형 입력 및 리턴
        char ch = in.next().charAt(0); // 문자 입력, 공백 기준으로 문자열을 입력 받음, 그중 해당 인덱스의 문자를 추+출

        float e = in.nextFloat(); 		// float 형 입력 및 리턴
        double f = in.nextDouble(); 	// double 형 입력 및 리턴

        boolean g = in.nextBoolean(); 	// boolean 형 입력 및 리턴

        String h = in.next(); 			// String 형 입력 및 리턴 (공백을 기준으로 한 단어를 읽음)
        String i = in.nextLine(); 		// String 형 입력 및 리턴 (개행을 기준으로 한 줄을 읽음)

    }

}
